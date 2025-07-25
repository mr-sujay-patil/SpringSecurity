package com.security.demo.SpringSecurity.controller;

import com.security.demo.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/")
    public List<Student> getStudent(){
        List<Student> students = List.of(
                new Student(1, "Virat", 98),
                new Student(2, "Rohit", 58),
                new Student(5, "Dhoni", 32)
        );
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
        return (CsrfToken)httpServletRequest.getAttribute("_csrf");
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student){
        return student;
    }

}
