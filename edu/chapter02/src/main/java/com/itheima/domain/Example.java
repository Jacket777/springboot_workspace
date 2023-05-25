package com.itheima.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/**
 * Created by 17081290 on 2021/2/20.
 */
@Component
@ConfigurationProperties(prefix = "example")
@Validated
public class Example {
    @org.hibernate.validator.constraints.Email
    private String email;
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Example{" +
                "email='" + email + '\'' +
                '}';
    }
}
