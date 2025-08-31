package com.bengisu.springProje.service.impl;

import com.bengisu.springProje.model.Employee;
import com.bengisu.springProje.repository.EmployeeRepository;
import com.bengisu.springProje.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesWithSalaryGreaterThan(Long amount)
    {
        return employeeRepository.findEmployeesWithSalaryGreaterThan(amount);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(String dept)
    {
        return employeeRepository.findEmployeesByDepartment(dept);
    }

    @Override
    public List<Employee> findByDepartment(String department)
    {
        return employeeRepository.findByDepartment(department);
    }

    @Override
    public List<Employee> findByFirstNameContaining(String firstName)
    {
        return employeeRepository.findByFirstNameContaining(firstName);
    }
}
