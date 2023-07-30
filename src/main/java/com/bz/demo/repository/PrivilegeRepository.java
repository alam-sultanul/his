package com.bz.demo.repository;

import com.bz.demo.model.security.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    List<Privilege> findPrivilegesByRoleId(Long roleId);

    @Modifying
    void deletePrivilegesByRoleId(Long roleId);
}
