package io.meta.studentmanagement.controller;

import io.meta.studentmanagement.models.Student;
import io.meta.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        System.out.println(student);
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/list")
    public  List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer id){
        studentService.delete(id);
    }
}
