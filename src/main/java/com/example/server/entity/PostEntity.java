package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "post")
    private TeacherEntity teacher;
    public PostEntity() {}
    public Integer getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
