package com.example.server.repository;

import com.example.server.entity.FacultyEntity;
import com.example.server.entity.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface FacultyRepo extends CrudRepository<FacultyEntity, Integer> {
    FacultyEntity findByName(String name);
}
