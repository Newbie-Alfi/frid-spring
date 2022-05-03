package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "chairs")
public class ChairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne
    @JoinColumn(name = "faculty_id", referencedColumnName = "id")
    private FacultyEntity faculty;

    @OneToOne(mappedBy = "chair")
    private TeacherEntity teacher;

    public ChairEntity() {}

    public String name() {
        return name;
    }
    public void name(String name) {
        this.name = name;
    }
}
