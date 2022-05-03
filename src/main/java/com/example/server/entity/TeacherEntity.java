package com.example.server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "chair_id", referencedColumnName = "id")
    private ChairEntity chair;

    @OneToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private PostEntity post;

    public TeacherEntity() {}

    public TeacherEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
