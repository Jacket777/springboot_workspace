package com.itheima.mapper;

import com.itheima.domain.Comment;
import org.apache.ibatis.annotations.*;

/**
 * Created by 17081290 on 2021/3/17.
 */
@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id=#{id}")
    public Comment findById(Integer id);
    @Insert("insert into t_comment(content,author,a_id)values(#(content),#(author),#(aId))")
    public int insertComment(Comment comment);
    @Update("update t_comment set content=#{content} where id=#{id}")
    public int updateComment(Comment comment);
    @Delete("delete from t_comment where id=#{id}")
    public int deleteComment(Integer id);
}
