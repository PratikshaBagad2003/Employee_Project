package com.example.payroll_service.repo;

import com.example.payroll_service.entities.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepo extends JpaRepository<Payroll,Long> {
}
