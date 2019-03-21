package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Rh;

@Repository
public interface RhRepository extends JpaRepository<Rh, Long> {

}
