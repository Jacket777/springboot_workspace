package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17081290 on 2021/3/23.
 */
@RestController
public class MyController {
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
