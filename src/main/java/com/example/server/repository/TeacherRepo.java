package com.example.server.repository;

import com.example.server.entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<TeacherEntity, Integer> {
    TeacherEntity findByFirstName(String firstName);
}
