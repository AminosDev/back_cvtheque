package com.service;

import java.util.List;
import java.util.Optional;

import com.models.LangueRating;

public interface LangueRatingService {
	void saveLangueRating(LangueRating langueR);
	boolean deleteLangueRating(Long id);
	void updateLangueRating(LangueRating langueR);
	List<LangueRating> getAllLangueRating();
	Optional<LangueRating> getLangueRating(Long id);
	

}
