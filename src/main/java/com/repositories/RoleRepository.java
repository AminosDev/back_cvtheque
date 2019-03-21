package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {

}
