package com.example.server.service;

import com.example.server.entity.FacultyEntity;
import com.example.server.repository.FacultyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepo facultyRepo;

    public Iterable<FacultyEntity> getAll() {
        return facultyRepo.findAll();
    }

    public FacultyEntity add(FacultyEntity faculty) {
        return facultyRepo.save(faculty);
    }

}
