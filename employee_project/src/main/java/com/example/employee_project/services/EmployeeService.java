package com.example.employee_project.services;

import com.example.employee_project.entity.Employee;

import org.springframework.stereotype.Service;
import com.example.employee_project.repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee getEmpById(Long empId)
    {
        return employeeRepo.findById(empId).get();
    }

    public Employee saveEmpData(Employee emp){
        return employeeRepo.save(emp);
    }

    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }


    public void deleteEmp(Long empId) {
        employeeRepo.deleteById(empId);
    }
}
