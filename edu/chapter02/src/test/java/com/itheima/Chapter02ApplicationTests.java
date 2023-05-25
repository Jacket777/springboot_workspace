package com.itheima;

import com.itheima.config.Chapter02Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //测试运行器，并加载Spring Boot测试注解
@SpringBootTest(classes= Chapter02Application.class) //标记单元测试类，并加载项目的上下文环境ApplicationContext
//@ContextConfiguration
public class Chapter02ApplicationTests {
//	@Autowired  //将Person作为Bean注入Spring容器
//	private Person person;
//
//	@Test
//	public void contextLoads() {
//		System.out.println(person);
//	}

//	@Autowired
//	private Student student;
//
//	@Test
//	public void studentTest(){
//		System.out.println(student);
//	}

//测试email JSR303
//	@Autowired
//	private Example example;
//
//    @Test
//	public void jsr303(){
//		System.out.println(example);
//	}

//	@Autowired
//	private MyProperties myProperties;
//
//	@Test
//	public void myProperties(){
//		System.out.println(myProperties);
//	}


	//@Autowired
	//private ApplicationContext applicationContext;

	//@Test
	//public void iocTest(){
	//	System.out.println("==isContain===="+applicationContext.containsBean("myService2"));
	//}

//测试随机参数值设置与应用
@Value("${tom.description}")
private String description;

@Test
public void placeholderTest(){
System.out.println(description);
}




}
