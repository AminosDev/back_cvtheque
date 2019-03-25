package com.service;

import java.util.List;
import java.util.Optional;

import com.models.CompetenceRating;

public interface CompetenceRatingService {
	void saveCompetenceRating(CompetenceRating cr);
	boolean deleteCompetenceRating(Long id);
	void updateCompetenceRating(CompetenceRating cr);
	List<CompetenceRating> getAllCompetenceRating();
	Optional<CompetenceRating> getCompetenceRating(Long id);
	

}
