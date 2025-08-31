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
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee)
    {
        return employeeRepository.findById(id).map(e -> {
            e.setFirstName(employee.getFirstName());
            e.setLastName(employee.getLastName());
            e.setDepartment(employee.getDepartment());
            e.setSalary(employee.getSalary());
            return employeeRepository.save(e);
        }).orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    @Override
    public void deleteEmployee(Integer id)
    {
        employeeRepository.deleteById(id);
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
