package com.bengisu.springProje.controller.impl;

import com.bengisu.springProje.controller.StudentController;
import com.bengisu.springProje.model.Student;
import com.bengisu.springProje.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllerImpl implements StudentController
{
    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}
