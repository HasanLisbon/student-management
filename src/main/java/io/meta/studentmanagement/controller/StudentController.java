package io.meta.studentmanagement.controller;

import io.meta.studentmanagement.models.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    public List<Student> getStudents(){
        return null;
    }
}
