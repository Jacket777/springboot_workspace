package com.msb;

import com.msb.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class StudyApplicationTests2 {

    @Autowired
    Person person;

    @Test
   public  void contextLoadsTest() {
        System.out.println("=======>>>>>>>>============"+person.toString());
    }

}
