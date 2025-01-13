package com.example.demospringsecurity.repository;

import com.example.demospringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);
}
