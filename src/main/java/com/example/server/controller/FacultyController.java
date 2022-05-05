package com.example.server.controller;

import com.example.server.entity.FacultyEntity;
import com.example.server.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping
    public ResponseEntity getAll() {
        try {
            Iterable<FacultyEntity> fac = facultyService.getAll();

            return ResponseEntity.ok(fac);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity add(@RequestBody FacultyEntity faculty) {
        try {
            System.out.println(faculty.getName());

            return ResponseEntity.ok(facultyService.add(faculty));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
