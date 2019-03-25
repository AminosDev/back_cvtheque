package com.service;

import java.util.List;
import java.util.Optional;

import com.models.EntretienStatut;

public interface EntretienStatutService {

	
	void saveEntretienStatut(EntretienStatut es);
	boolean deleteEntretienStatut(Long id);
	void updateEntretienStatut(EntretienStatut es);
	List<EntretienStatut> getAllEntretienStatut();
	Optional<EntretienStatut> getEntretienStatut(Long id);
}
