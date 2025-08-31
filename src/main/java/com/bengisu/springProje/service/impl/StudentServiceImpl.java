package com.bengisu.springProje.service.impl;

import com.bengisu.springProje.model.Student;
import com.bengisu.springProje.repository.StudentRepository;
import com.bengisu.springProje.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService
{
    private final StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents()
    {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }
}
