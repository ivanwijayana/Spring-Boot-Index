package com.uinsgd.ac.id.ivan.service;

import com.uinsgd.ac.id.ivan.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    Optional<Student> findById(Long id);

    Optional<Student> findByEmail(String email);

    Student save(Student std);

    void deleteById(Long id);
}
