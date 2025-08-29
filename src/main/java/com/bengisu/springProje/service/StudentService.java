package com.bengisu.springProje.service;

import com.bengisu.springProje.model.Student;

import java.util.List;

public interface StudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
