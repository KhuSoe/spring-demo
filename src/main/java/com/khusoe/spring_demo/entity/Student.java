package com.khusoe.spring_demo.entity;

import java.time.LocalDate;

public class Student {

    private String name;

    private int age;

    private String email;

    private LocalDate dateOfBirth;

    public Student(String name, int age, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
