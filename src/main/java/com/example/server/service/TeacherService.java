package com.example.server.service;

import com.example.server.entity.TeacherEntity;
import com.example.server.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public TeacherEntity add(TeacherEntity teacher) {
            return teacherRepo.save(teacher);
    }

    public TeacherEntity getTeachers(String firstName) {
        Iterable<TeacherEntity> teachers =  teacherRepo.findAll();
//        Field[] fields = teachers.getClass().getFields();
//        ArrayList<TeacherEntity> response = new ArrayList<TeacherEntity>();
//        for (TeacherEntity teacher : teachers) {
////            System.out.println(teacher.getClass().getFields().toString());
////            for (Field field : fields) {
////                System.out.println(field.getName());
////            }
//        }
        return teacherRepo.findByFirstName(firstName);
    }

    public  Iterable<TeacherEntity> getTeachers() {
        return teacherRepo.findAll();
    }
}
