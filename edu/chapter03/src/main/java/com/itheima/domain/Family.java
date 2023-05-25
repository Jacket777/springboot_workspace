package com.itheima.domain;

import org.springframework.data.redis.core.index.Indexed;

/**
 * Created by 17081290 on 2021/4/21.
 */
public class Family {
    @Indexed
    private String type;
    @Indexed
    private String username;

    public Family(String type, String username) {
        this.type = type;
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
