package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.models.LangueRating;

@Repository
public interface LangueRatingRepository extends JpaRepository<LangueRating,Long> {

}
