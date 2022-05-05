package com.example.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "chairs")
public class ChairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String facultyName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id", referencedColumnName = "id")
    private FacultyEntity faculty;

    @OneToOne(fetch = FetchType.LAZY)
    private TeacherEntity teacher;
    public ChairEntity() {}
    public Integer getId () {
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

    public String getFacultyName() {
        return this.faculty.getName();
    }
}
