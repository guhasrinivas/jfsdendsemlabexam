package com.klef.jfsd.exam.demo.config;

import com.klef.jfsd.exam.demo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {
    @Bean
    public Employee employee() {
        return new Employee(101, "John Doe", 50000.0, "Engineering", Arrays.asList("Java", "Spring", "SQL"));
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(201);
        instructor.setName("Jane Smith");
        instructor.setEmail("jane.smith@example.com");
        instructor.setPhoneNumber("1234567890");
        return instructor;
    }

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId(301);
        course.setCourseName("Spring Framework");
        course.setCredits(3);
        course.setInstructor(instructor()); // Setter-based autowiring
        return course;
    }
}
