package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Formation;

public interface FormationService {

	
	void saveFormation(Formation formation);
	boolean deleteFormation(Long id);
	void updateFormation(Formation f);
	List<Formation> getAllFormation();
	Optional<Formation> getFormation(Long id);
}
