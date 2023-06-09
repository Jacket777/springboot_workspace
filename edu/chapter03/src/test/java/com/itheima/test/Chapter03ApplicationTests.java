package com.itheima.test;

import com.itheima.Chapter03Application;
import com.itheima.domain.Article;
import com.itheima.domain.Comment;
import com.itheima.mapper.ArticleMapper;
import com.itheima.mapper.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Chapter03Application.class)
public class Chapter03ApplicationTests {
	@Autowired
	private CommentMapper commentMapper;

	@Test
	public void selectComment() {
		Comment comment = commentMapper.findById(1);
		System.out.println(comment);
	}

	@Autowired
	private ArticleMapper articleMapper;

	@Test
	public void selectArticle(){
		Article article = articleMapper.selectArticle(1);
		System.out.println(article);

	}
}
