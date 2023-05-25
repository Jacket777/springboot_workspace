package com.itheima.test;

import com.itheima.Chapter03Application;
import com.itheima.domain.Address;
import com.itheima.domain.Discuss;
import com.itheima.domain.Family;
import com.itheima.domain.Person;
import com.itheima.repository.DiscussRepository;
import com.itheima.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;


/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Chapter03Application.class)
public class RedisTests {
	@Autowired
   private PersonRepository repository;

	//1.---测试执行该方法
	@Test
	public void savePerson() {
		Person person = new Person("张", "有才");
		Person person2 = new Person("James", "Harden");
        //创建并添加住址信息
		Address address = new Address("北京", "China");
		person.setAddress(address);
		//创建并添加家庭成员
		List<Family> list = new ArrayList<>();
		Family dad = new Family("父亲", "张父");
		Family mom = new Family("母亲", "张母");
		list.add(dad);
		list.add(mom);
		person.setFamilyList(list);
		//向Redis数据库中添加数据
		Person save = repository.save(person);
		Person save2 = repository.save(person2);
		System.out.println(save);
		System.out.println(save2);
	}

	//2.使用二级索引进行查询
	@Test
	public void selectPerson(){
		List<Person> list = repository.findByAddress_city("北京");
		System.out.println(list);
	}

	//3.更新
	@Test
	public void updatePerson(){
		Person person =repository.findByFirstnameAndLastname("张", "有才").get(0);
		person.setLastname("小明");
		Person update = repository.save(person);
		System.out.println(update);}


	//4.删除
	@Test
	public void deletePerson(){
		Person person =repository.findByFirstnameAndLastname("张", "小明").get(0);
		repository.delete(person);
	}
}
