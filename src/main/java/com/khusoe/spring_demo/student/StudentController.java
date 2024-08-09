package com.khusoe.spring_demo.student;

import com.khusoe.spring_demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return service.getStudentByEmail(email);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.delete(email);
    }
}
