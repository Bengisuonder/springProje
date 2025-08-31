package com.bengisu.springProje.service;

import com.bengisu.springProje.dto.request.StudentRequest;
import com.bengisu.springProje.dto.response.StudentResponse;

import java.util.List;

public interface StudentService
{
    StudentResponse saveStudent(StudentRequest studentRequest);
    List<StudentResponse> getAllStudents();
    StudentResponse updateStudent(Integer id, StudentRequest studentRequest);
    void deleteStudent(Integer id);
}
