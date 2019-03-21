package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
