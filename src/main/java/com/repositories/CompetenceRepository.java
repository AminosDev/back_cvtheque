package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Competence;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {

}
