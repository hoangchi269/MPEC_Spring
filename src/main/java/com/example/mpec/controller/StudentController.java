package com.example.mpec.controller;

import com.example.mpec.entity.Student;
import com.example.mpec.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
//
//    public StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }

    // DI - Dependence Injection
    //IoC
//    @Autowired
//    StudentService studentService;

    @GetMapping("/hello")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
//    @GetMapping("/hello2")
//    public List<String> hello(){
//        return studentService.Student();
//    }
}
