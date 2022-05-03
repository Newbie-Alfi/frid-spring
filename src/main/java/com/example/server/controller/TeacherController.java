package com.example.server.controller;

import com.example.server.entity.TeacherEntity;
import com.example.server.repository.TeacherRepo;
import com.example.server.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseEntity addTeacher(@RequestBody TeacherEntity teacher) {
        try {
            teacherService.add(teacher);
            return ResponseEntity.ok("Teacher added...");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
//        catch (Exception e) {
//            return  ResponseEntity.badRequest().body("An error has occurred");
//        }
    }

    @GetMapping(params = "firstName")
    public ResponseEntity getTeacher(@RequestParam String firstName) {
        try {
            if (firstName == null) {
                return ResponseEntity.badRequest().body("Param is null");
            }
            else {
                TeacherEntity t = teacherService.getTeachers(firstName);
                return ResponseEntity.ok(t);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error, sorry");
        }
    }

    @GetMapping
    public ResponseEntity getTeachers() {
        try {
            Iterable<TeacherEntity> t = teacherService.getTeachers();
            return ResponseEntity.ok(t);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error, sorry");
        }
    }
}
