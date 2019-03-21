package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
