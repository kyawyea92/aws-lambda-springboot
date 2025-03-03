package com.helloworld.test.service;


import com.helloworld.test.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getAllStudents(){
        return students;
    }

}
