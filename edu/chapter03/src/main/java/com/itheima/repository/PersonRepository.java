package com.itheima.repository;

import com.itheima.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by 17081290 on 2021/4/21.
 */
public interface PersonRepository extends CrudRepository<Person,String>{
    List<Person> findByLastname(String lastname);
    Page<Person> findPersonByLastname(String lastname, Pageable page);
    List<Person>findByFirstnameAndLastname(String firstname,String lastname);
    List<Person>findByAddress_city(String city);
    List<Person>findByFamilyList_Username(String username);
}
