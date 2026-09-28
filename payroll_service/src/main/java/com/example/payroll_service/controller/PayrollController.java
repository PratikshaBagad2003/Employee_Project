package com.example.payroll_service.controller;
import com.example.payroll_service.client.EmployeeClient;
import com.example.payroll_service.client.RoleClient;
import com.example.payroll_service.entities.Payroll;
import com.example.payroll_service.service.PayrollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayrollController {

    private final PayrollService payrollService;
    private final EmployeeClient employeeClient;
    private final RoleClient roleClient;


    public PayrollController(PayrollService payrollService,EmployeeClient employeeClient,RoleClient roleClient) {
        this.payrollService = payrollService;
        this.employeeClient=employeeClient;
        this.roleClient=roleClient;
    }

    @GetMapping("/{payrollId}")
    public Payroll getPayrollById(@PathVariable Long payrollId){
        return payrollService.getPayrollById(payrollId);
    }

    @PostMapping("/{empId}/role/{roleId}")
    public Payroll createPayroll(@PathVariable Long empId,@PathVariable Long roleId){

        return payrollService.createPayroll(empId,roleId);
    }

    @GetMapping
    public List<Payroll> getAll(){
        return payrollService.findAllPayroll();
    }

    @DeleteMapping("/{payrollId}")
    public void deletePayroll(@PathVariable Long payrollId){
        payrollService.deletePayroll(payrollId);
    }
}

