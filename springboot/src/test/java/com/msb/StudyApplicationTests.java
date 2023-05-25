package com.msb;

import com.msb.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
 public class StudyApplicationTests {

    @Autowired
    Person person;

    @Test
   public  void contextLoadsTest() {
        System.out.println("=======>>>>>>>>============"+person.toString());
    }

}
