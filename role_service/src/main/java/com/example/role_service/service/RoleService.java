package com.example.role_service.service;

import com.example.role_service.entities.Role;
import com.example.role_service.repo.RoleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    public RoleRepo roleRepo;

    public RoleService(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public Role getRoleById(Long roleId) {
        return roleRepo.findById(roleId).get();
    }

    public Role createEmpRole(Role role) {
        return roleRepo.save(role);
    }

    public void deleteEmpRole(Long roleId) {
        roleRepo.deleteById(roleId);
    }

    public List<Role> getAllRole() {
        return roleRepo.findAll();
    }
}
