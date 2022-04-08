package com.uinsgd.ac.id.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uinsgd.ac.id.ivan.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);
}
