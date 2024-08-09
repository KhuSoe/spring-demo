package com.khusoe.spring_demo.student;

import com.khusoe.spring_demo.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> getAllStudents();
    Student getStudentByEmail(String email);
    void delete(String email);
    Student update(Student student);

}
