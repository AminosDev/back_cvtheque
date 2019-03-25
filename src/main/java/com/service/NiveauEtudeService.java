package com.service;

import java.util.List;
import java.util.Optional;

import com.models.NiveauEtude;

public interface NiveauEtudeService {

	
	void saveNiveauEtude(NiveauEtude ne);
	boolean deleteNiveauEtude(Long id);
	void updateNiveauEtude(NiveauEtude n);
	List<NiveauEtude> getAllNiveauEtude();
	Optional<NiveauEtude> getNiveauEtude(Long id);
}
