package com.itheima.mapper;

import com.itheima.domain.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 17081290 on 2021/4/20.
 */
@Mapper
public interface ArticleMapper {
    public Article selectArticle(Integer id);
    public int updateArticle(Article article);
}
