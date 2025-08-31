package com.bengisu.springProje.controller;

import com.bengisu.springProje.model.Employee;
import com.bengisu.springProje.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/salary/{amount}")
    public List<Employee> getEmployeesWithSalaryGreaterThan(@PathVariable Long amount)
    {
        return employeeService.getEmployeesWithSalaryGreaterThan(amount);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee)
    {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id)
    {
        employeeService.deleteEmployee(id);
        return "Employee with ID " + id + " deleted successfully";
    }

    @GetMapping("/department/{dept}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String dept)
    {
        return employeeService.getEmployeesByDepartment(dept);
    }

    @GetMapping("/findByDepartment/{department}")
    public List<Employee> findByDepartment(@PathVariable String department)
    {
        return employeeService.findByDepartment(department);
    }

    @GetMapping("/findByName/{firstName}")
    public List<Employee> findByFirstNameContaining(@PathVariable String firstName)
    {
        return employeeService.findByFirstNameContaining(firstName);
    }

    @GetMapping("/pageable")
    public Page<Employee> getAllEmployees(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size)
    {
        return employeeService.getAllEmployees(page, size);
    }
}
