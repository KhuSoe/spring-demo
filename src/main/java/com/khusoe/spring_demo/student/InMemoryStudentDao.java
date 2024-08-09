package com.khusoe.spring_demo.student;

import com.khusoe.spring_demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentDao {

    List<Student> students = new ArrayList<Student>();

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentByEmail(String email) {
        Student student = students.stream()
                                    .filter(s -> s.getEmail().equals(email))
                                    .findFirst()
                                    .orElse(null);
        return student;
    }

    public void delete(String email) {
        Student student = getStudentByEmail(email);
        if (student != null) {
            students.remove(student);
        }
    }

    public Student update(Student student) {
        return null;
    }
}
