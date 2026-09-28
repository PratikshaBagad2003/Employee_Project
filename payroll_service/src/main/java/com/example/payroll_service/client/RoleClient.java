package com.example.payroll_service.client;

import com.example.payroll_service.dto.RoleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "role-service",url = "http://localhost:8082")

public interface RoleClient {

    @GetMapping("/role/{roleId}")
    RoleDTO getRoleById(@PathVariable Long roleId);
}
