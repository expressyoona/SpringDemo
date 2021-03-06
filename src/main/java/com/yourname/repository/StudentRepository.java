package com.yourname.repository;

import com.yourname.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;


import java.math.BigInteger;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> getStudentById(long id);
}
