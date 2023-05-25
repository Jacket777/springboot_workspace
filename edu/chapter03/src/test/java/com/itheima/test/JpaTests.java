package com.itheima.test;

import com.itheima.Chapter03Application;
import com.itheima.domain.Discuss;
import com.itheima.repository.DiscussRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.util.Optional;


/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Chapter03Application.class)
public class JpaTests {
	@Autowired
	private DiscussRepository repository;

	//1.使用JpaRepository内部方法进行数据操作
	@Test
	public void selectComment(){
		Optional<Discuss> optional = repository.findById(1);
		if(optional.isPresent()){
			System.out.println("======="+optional.get());
		}
	}


	//2.使用方法名关键字进行数据操作
	@Test
	public void selectCommentByKeys(){
		List<Discuss> list = repository.findByAuthorNotNull();
		System.out.println(list);

		Optional<Discuss> optional = repository.findById(1);
		if(optional.isPresent()){
			System.out.println(optional.get());
		}
	}

	//3.使用@Query注解进行数据操作
	@Test
	public void selectCommentPaged(){
		Pageable pageable = PageRequest.of(0, 3);
		List<Discuss> allPaged = repository.getDiscussPaged(1,pageable);
		System.out.println(allPaged);
	}


	//4.使用Example封装参数进行查询操作
	@Test
	public void selectCommentByExample(){
		//1. 使用Example精确匹配查询条件
		Discuss discuss = new Discuss();
		discuss.setAuthor("Jack");
		Example<Discuss>example = Example.of(discuss);
		List<Discuss> list = repository.findAll(example);
		System.out.println(list);
	}



	//4.使用Example封装参数进行查询操作
	@Test
	public void selectCommentByExampleMatcher(){
		//1. 使用ExampleMathcer模糊匹配查询条件
		Discuss discuss = new Discuss();
		discuss.setAuthor("J");
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("author",startsWith());
		Example<Discuss>example = Example.of(discuss,matcher);
		List<Discuss> list = repository.findAll(example);
		System.out.println(list);
	}
}