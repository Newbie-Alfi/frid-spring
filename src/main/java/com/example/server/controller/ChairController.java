package com.example.server.controller;

import com.example.server.entity.ChairEntity;
import com.example.server.entity.FacultyEntity;
import com.example.server.repository.ChairRepo;
import com.example.server.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chairs")
public class ChairController {

    @Autowired
    private ChairRepo chairRepo;

    @GetMapping
    public ResponseEntity getAll() {
        try {
            return ResponseEntity.ok(chairRepo.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity add(@RequestBody ChairEntity chair) {
        try {
            return ResponseEntity.ok(chairRepo.save(chair));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
