package io.meta.studentmanagement.service;

import io.meta.studentmanagement.models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void delete(Integer id);
}
