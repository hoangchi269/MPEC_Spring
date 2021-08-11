package com.example.mpec.serviceImpl;

import com.example.mpec.entity.Student;
import com.example.mpec.repository.StudentRepository;
import com.example.mpec.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    //CDI
//    public StudentServiceImpl(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    //SDI SI setter inject
    // dùng đẻ inject từng phần một mà constructor không làm được
    //SI ghi đè lại CI
    // Khi dùng cả CI và SI thì Ioc sẽ ưu tiên dùng SI
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.getStudent();
    }
}
