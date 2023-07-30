package com.bz.demo.service;

import com.bz.demo.model.security.Role;

import java.util.List;



public interface RoleService {
    List<Role> getRoles();
    Role getRole(Long id);
    Role saveRole(Role role);
    void deleteRole(Long id);
}
