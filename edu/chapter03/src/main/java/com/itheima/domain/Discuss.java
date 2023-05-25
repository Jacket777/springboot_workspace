package com.itheima.domain;
import javax.persistence.*;

/**
 * Created by 17081290 on 2021/3/17.
 */
@Entity(name="t_comment") //设置ORM实体类，并指定映射的表名
public class Discuss {
    @Id //表明映射对应的主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置主键自增策越
    private Integer id;
    private String content;
    private String author;
    @Column(name="a_id") //指定映射的表字段名
    private Integer aid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aid=" + aid +
                '}';
    }
}
