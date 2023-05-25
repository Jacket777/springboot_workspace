package com.ithema.service;

import com.ithema.domain.Comment;
import com.ithema.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by 17081290 on 2021/4/29.
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    //@Cacheable(cacheNames = "comment")  //基于内存的缓存
    @Cacheable(cacheNames = "comment",unless = "#result==null")  //基于Redis
    public Comment findById(int comment_id){
        Optional<Comment> optional = commentRepository.findById(comment_id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @CachePut(cacheNames = "comment", key="#result.id")
    public Comment updateComment(Comment comment){
        commentRepository.updateComment(comment.getAuthor(),comment.getaId());
        return comment;
    }


    @CacheEvict(cacheNames = "comment")
    public void deleteComment(int comment_id){
        commentRepository.deleteById(comment_id);
    }




}
