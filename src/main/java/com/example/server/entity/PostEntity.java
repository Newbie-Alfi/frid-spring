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

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
}
