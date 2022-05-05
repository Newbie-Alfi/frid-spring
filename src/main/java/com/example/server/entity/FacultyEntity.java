package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "faculty")
    private ChairEntity chair;
    public FacultyEntity() {}
    public FacultyEntity(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
