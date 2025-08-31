package com.bengisu.springProje.service;

import com.bengisu.springProje.model.Employee;
import java.util.List;

public interface EmployeeService
{
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);
    List<Employee> getEmployeesWithSalaryGreaterThan(Long amount);
    List<Employee> getEmployeesByDepartment(String dept);
    List<Employee> findByDepartment(String department);
    List<Employee> findByFirstNameContaining(String firstName);
}
