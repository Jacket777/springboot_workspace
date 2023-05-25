package com.ithema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ithema.domain.Comment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 17081290 on 2021/4/28.
 *
 * https://www.jb51.net/article/174863.htm
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    //根据评论id修改评论作者author
    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id =?2")
    public int updateComment(String author,Integer id);
}
