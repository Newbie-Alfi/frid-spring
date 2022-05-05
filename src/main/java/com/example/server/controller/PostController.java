package com.example.server.controller;

import com.example.server.entity.ChairEntity;
import com.example.server.entity.PostEntity;
import com.example.server.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping
    public ResponseEntity getAll() {
        try {
            return ResponseEntity.ok(postRepo.findAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping
    public ResponseEntity add(@RequestBody PostEntity chair) {
        try {
            return ResponseEntity.ok(postRepo.save(chair));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
