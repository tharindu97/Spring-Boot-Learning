package com.example.student_managemen_system;

import com.example.student_managemen_system.entity.Student;
import com.example.student_managemen_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagemenSystemApplication{
    public static void main(String[] args) {
        SpringApplication.run(StudentManagemenSystemApplication.class, args);
    }
}
