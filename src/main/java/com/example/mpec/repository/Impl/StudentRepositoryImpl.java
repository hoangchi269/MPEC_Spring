package com.example.mpec.repository.Impl;

import com.example.mpec.entity.Student;
import com.example.mpec.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        System.out.println("ConnectDB, Query get list student");
        return students;
    }
}
