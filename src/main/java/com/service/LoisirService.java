package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Loisir;

public interface LoisirService {
	
	void saveLoisir(Loisir loisir);
	boolean deleteLoisir(Long id);
	void updateLoisir(Loisir loisir);
	List<Loisir> getAllLoisir();
	Optional<Loisir> getLoisir(Long id);
}
