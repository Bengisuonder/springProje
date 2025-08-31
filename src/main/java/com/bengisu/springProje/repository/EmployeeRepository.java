package com.bengisu.springProje.repository;

import com.bengisu.springProje.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    @Query("SELECT e FROM Employee e WHERE e.salary > :amount")
    List<Employee> findEmployeesWithSalaryGreaterThan(@Param("amount") Long amount);

    @Query(value = "SELECT * FROM spring.employee WHERE department = :dept", nativeQuery = true)
    List<Employee> findEmployeesByDepartment(@Param("dept") String dept);
}
