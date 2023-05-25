package com.itheima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17081290 on 2021/2/20.
 */
@RestController //该注解为组合注解，等同于Spring 中的@Controller + @ResponseBody注解
public class HelloController {
    @GetMapping("/hello") //该注解等同于Spring 中的@RequestMapping(RequestMethod.GET)注解
    public String hello(){
        return "hello Spring Boot";
    }
}
