package com.example.payroll_service.service;

import com.example.payroll_service.client.EmployeeClient;
import com.example.payroll_service.client.RoleClient;
import com.example.payroll_service.dto.EmployeeDTO;
import com.example.payroll_service.dto.RoleDTO;
import com.example.payroll_service.entities.Payroll;
import com.example.payroll_service.repo.PayrollRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class PayrollService {

    private final PayrollRepo payrollRepo;
    private final EmployeeClient employeeClient;
    private final RoleClient roleClient;

    public PayrollService(PayrollRepo payrollRepo,EmployeeClient employeeClient,RoleClient roleClient) {
        this.payrollRepo = payrollRepo;
        this.employeeClient=employeeClient;
        this.roleClient=roleClient;
    }

    public Payroll getPayrollById(@PathVariable Long payrollId){
        return payrollRepo.findById(payrollId).get();
    }

        public Payroll createPayroll(Long empId, Long roleId) {

            EmployeeDTO employee =
                    employeeClient.getEmployeeById(empId);

            RoleDTO role =
                    roleClient.getRoleById(roleId);

            Payroll payroll = new Payroll();

            payroll.setEmpId(employee.getEmpId());
            payroll.setFirstName(employee.getFirstName());
            payroll.setLastName(employee.getLastName());

            payroll.setRoleId(role.getRoleId());
            payroll.setRoleName(role.getRoleName());
            payroll.setDescription(role.getDescription());

            return payrollRepo.save(payroll);
        }


    public List<Payroll> findAllPayroll(){
        return payrollRepo.findAll();
    }

    public void deletePayroll(@PathVariable Long payrollId){
        payrollRepo.deleteById(payrollId);
    }
}
