package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Entretien;

@Repository
public interface EntretienRepository extends JpaRepository<Entretien, Long> {

}
