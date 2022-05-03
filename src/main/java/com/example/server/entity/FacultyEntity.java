package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "faculty")
    private ChairEntity chair;

    public FacultyEntity() {}

    public String name() {
        return name;
    }
    public void name(String name) {
        this.name = name;
    }
}
