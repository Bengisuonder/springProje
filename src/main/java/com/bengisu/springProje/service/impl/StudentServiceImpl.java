package com.bengisu.springProje.service.impl;

import com.bengisu.springProje.dto.request.StudentRequest;
import com.bengisu.springProje.dto.response.StudentResponse;
import com.bengisu.springProje.model.Student;
import com.bengisu.springProje.repository.StudentRepository;
import com.bengisu.springProje.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService
{
    private final StudentRepository studentRepository;

    @Override
    public StudentResponse saveStudent(StudentRequest studentRequest)
    {
        Student student = new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setBirthOfDate(studentRequest.getBirthOfDate());
        studentRepository.save(student);
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setMessage("Öğrenci başarıyla kaydedildi.");
        return studentResponse;
    }
//Bu kısım
    @Override
    public List<StudentResponse> getAllStudents()
    {
        List<Student> students = studentRepository.findAll();
        List<StudentResponse> responses = new ArrayList<>();

        for (Student s : students)
        {
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setFirstName(s.getFirstName());
            studentResponse.setLastName(s.getLastName());
            studentResponse.setMessage("Öğrenciler listelendi.");
            responses.add(studentResponse);
        }
        return responses;
    }

    @Override
    public StudentResponse updateStudent(Integer id, StudentRequest studentRequest)
    {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Id'ye kayıtlı öğrenci bulunamadı: " + id));
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setBirthOfDate(studentRequest.getBirthOfDate());
        studentRepository.save(student);
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setMessage("Öğrenci başarıyla güncellendi.");
        return studentResponse;
    }

    @Override
    public void deleteStudent(Integer id)
    {
        studentRepository.deleteById(id);
    }
}
