package com.example.employee_project.controller;

import com.example.employee_project.entity.Employee;
import org.springframework.web.bind.annotation.*;
import com.example.employee_project.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    public EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @GetMapping("{empId}")
    public Employee getEmpById(@PathVariable Long empId){
        {

            return empService.getEmpById(empId);
        }
    }

    @PostMapping
    public Employee saveEmpData(@RequestBody Employee emp)
    {
        return empService.saveEmpData(emp);
    }

    @GetMapping
    public List<Employee> getAllEmp(){
        return empService.getAll();
    }

    @DeleteMapping("/{empId}")
    public void deleteEmp(@PathVariable Long empId){
        empService.deleteEmp(empId);
    }


}
