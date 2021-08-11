package com.example.mpec.service;

import com.example.mpec.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    public List<Student> getStudent();
}
