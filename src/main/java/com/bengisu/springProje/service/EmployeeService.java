package com.bengisu.springProje.service;

import com.bengisu.springProje.model.Employee;
import java.util.List;

public interface EmployeeService
{
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    List<Employee> getEmployeesWithSalaryGreaterThan(Long amount);
    List<Employee> getEmployeesByDepartment(String dept);
    List<Employee> findByDepartment(String department);
    List<Employee> findByFirstNameContaining(String firstName);
}
