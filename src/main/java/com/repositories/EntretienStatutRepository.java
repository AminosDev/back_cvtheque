package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.EntretienStatut;

@Repository
public interface EntretienStatutRepository extends JpaRepository<EntretienStatut, Long> {

}
