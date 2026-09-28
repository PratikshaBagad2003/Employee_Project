package com.example.payroll_service.client;

import com.example.payroll_service.dto.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service",url = "http://localhost:8081")
public interface EmployeeClient {
@GetMapping("/employee/{empId}")
    EmployeeDTO getEmployeeById(@PathVariable Long empId);
}
