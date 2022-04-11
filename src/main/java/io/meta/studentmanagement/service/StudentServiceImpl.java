package io.meta.studentmanagement.service;

import io.meta.studentmanagement.models.Student;
import io.meta.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl  implements  StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void updateStudent(Student student) {
        Optional<Student> student1 = studentRepository.findById(student.getId());
        if(student1.isPresent()){
            Student student2=student1.get();
            student2.setName(student.getName());
            student2.setAddress(student.getAddress());
            student2.setEmail(student.getEmail());
            studentRepository.save(student2);
        }
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
