package com.example.role_service.controller;

import com.example.role_service.entities.Role;
import com.example.role_service.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    public RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{roleId}")
    public Role getRole (@PathVariable Long roleId){
        return roleService.getRoleById(roleId);

    }

    @PostMapping
    public Role createRole(@RequestBody Role role){
        return roleService.createEmpRole(role);
    }

    @DeleteMapping("/{roleId}")
    public void deleteRole(@PathVariable Long roleId){
        roleService.deleteEmpRole(roleId);
    }

    @GetMapping
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }

}
