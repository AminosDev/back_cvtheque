package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Loisir;

@Repository
public interface LoisirRepository extends JpaRepository<Loisir, Long> {

}
