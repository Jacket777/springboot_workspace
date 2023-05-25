package com.itheima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17081290 on 2021/2/20.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello Spring Boot--6";
    }
}
