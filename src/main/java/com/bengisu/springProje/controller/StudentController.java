package com.bengisu.springProje.controller;

import com.bengisu.springProje.model.Student;
import com.bengisu.springProje.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController
{
    private final StudentService studentService;

    @PostMapping(path = "/save")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}
