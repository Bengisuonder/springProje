package com.bengisu.springProje.controller;

import com.bengisu.springProje.model.Student;

import java.util.List;

public interface StudentController
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
