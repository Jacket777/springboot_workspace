package com.itheima.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17081290 on 2021/2/20.
 */
@RestController
public class DBController {
    @Autowired
    private DBConnector dbConnector;
    @GetMapping("/showDB")
    public String showDB(){
        dbConnector.configure();
        return "success request";
    }
}
