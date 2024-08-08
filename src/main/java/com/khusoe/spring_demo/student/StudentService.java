package com.khusoe.spring_demo.student;

import com.khusoe.spring_demo.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student("Khu Soe", 22, "saw@gmail.com", LocalDate.of(2002,06,30)),
                new Student("Doh Soe", 18, "saw@gmail.com", LocalDate.of(2006,06,30))
        );
    }

}
