package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
public class EmployeeRepository {
    // package payroll;
    interface EmployeeRepository extends JpaRepository<Employee, Long> {

    }
}
