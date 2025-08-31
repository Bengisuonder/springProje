package com.bengisu.springProje.controller;

import com.bengisu.springProje.dto.request.StudentRequest;
import com.bengisu.springProje.dto.response.StudentResponse;
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
    public StudentResponse saveStudent(@RequestBody StudentRequest studentRequest)
    {
        return studentService.saveStudent(studentRequest);
    }

    @GetMapping(path = "/list")
    public List<StudentResponse> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    public StudentResponse updateStudent(@PathVariable Integer id, @RequestBody StudentRequest studentRequest)
    {
        return studentService.updateStudent(id, studentRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id)
    {
        studentService.deleteStudent(id);
    }
}
