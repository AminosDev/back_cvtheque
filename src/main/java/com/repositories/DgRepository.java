package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Dg;

@Repository
public interface DgRepository extends JpaRepository<Dg, Long> {

}
