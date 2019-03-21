package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.NiveauEtude;

@Repository
public interface NiveauEtudeRepository extends JpaRepository<NiveauEtude, Long> {

}
