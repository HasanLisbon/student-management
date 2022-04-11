package io.meta.studentmanagement.repository;

import io.meta.studentmanagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
