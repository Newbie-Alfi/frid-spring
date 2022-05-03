package com.example.server.service;

import com.example.server.entity.TeacherEntity;
import com.example.server.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public TeacherEntity add(TeacherEntity teacher) {
            return teacherRepo.save(teacher);
    }

    public TeacherEntity getTeachers(String firstName) {
        return teacherRepo.findByFirstName(firstName);
    }

    public  Iterable<TeacherEntity> getTeachers() {
        return teacherRepo.findAll();
    }
}
