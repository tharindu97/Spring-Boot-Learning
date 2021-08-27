package com.example.student_managemen_system.repository;
import com.example.student_managemen_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
