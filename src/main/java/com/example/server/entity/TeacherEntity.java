package com.example.server.entity;

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
    private String patronymic;
    private Boolean sex;
    private String birthDate;
    private String birthCity;

    private Integer pSeries;
    private Integer pNumber;
    private String pRelease;
    private String pIssued;
    private String pDivisionCode;
    private String chairName;
    private String postName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chair_id", referencedColumnName = "id")
    private ChairEntity chair;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private PostEntity post;
    public TeacherEntity() { }
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Integer getpSeries() {
        return pSeries;
    }

    public void setpSeries(Integer pSeries) {
        this.pSeries = pSeries;
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public String getpRelease() {
        return pRelease;
    }

    public void setpRelease(String pRelease) {
        this.pRelease = pRelease;
    }

    public String getpIssued() {
        return pIssued;
    }

    public void setpIssued(String pIssued) {
        this.pIssued = pIssued;
    }

    public String getpDivisionCode() {
        return pDivisionCode;
    }

    public void setpDivisionCode(String pDivisionCode) {
        this.pDivisionCode = pDivisionCode;
    }

    public String getChairName() {
        return this.chair.getName();
    }

    public String getPostName() {
        return this.post.getName();
    }
}
