package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.CompetenceRating;

@Repository
public interface CompetenceRatingRepository extends JpaRepository<CompetenceRating, Long> {

}
