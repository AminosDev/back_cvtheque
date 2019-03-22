package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Candidat;

public interface CandidatService {

	void saveCandidat(Candidat candidat);
	boolean deleteCandidat(Long id);
	void updateCandidat(Candidat c);
	List<Candidat> getAllCandidat();
	Optional<Candidat> getCandidat(Long id);
	
}
