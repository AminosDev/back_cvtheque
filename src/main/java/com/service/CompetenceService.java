package com.service;

import java.util.List;
import java.util.Optional;


import com.models.Competence;

public interface CompetenceService {

	void saveCompetence(Competence c);
	boolean deleteCompetence(Long id);
	void updateCompetence(Competence c);
	List<Competence> getAllCompetence();
	Optional<Competence> getCompetence(Long id);
	
}
