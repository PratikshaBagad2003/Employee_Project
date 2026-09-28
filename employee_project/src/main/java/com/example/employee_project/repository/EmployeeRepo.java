package com.example.employee_project.repository;

import com.example.employee_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee,Long>{
}
