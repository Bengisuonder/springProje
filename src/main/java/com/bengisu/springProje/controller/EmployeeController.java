package com.bengisu.springProje.controller;

import com.bengisu.springProje.model.Employee;
import com.bengisu.springProje.model.Student;
import com.bengisu.springProje.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController
{
    private final EmployeeService employeeService;

    @PostMapping(path = "/save")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees() { return employeeService.getAllEmployees(); }

    @GetMapping("/salary/{amount}")
    public List<Employee> getEmployeesWithSalaryGreaterThan(@PathVariable Long amount)
    {
        return employeeService.getEmployeesWithSalaryGreaterThan(amount);
    }

    @GetMapping("/department/{dept}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String dept)
    {
        return employeeService.getEmployeesByDepartment(dept);
    }
}
