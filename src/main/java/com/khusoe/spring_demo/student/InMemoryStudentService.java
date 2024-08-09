package com.khusoe.spring_demo.student;

import com.khusoe.spring_demo.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    public InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student student) {
        return this.dao.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.dao.getAllStudents();
    }

    @Override
    public Student getStudentByEmail(String email) {
        return this.dao.getStudentByEmail(email);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }

    @Override
    public Student update(Student student) {
        return this.dao.update(student);
    }


}
