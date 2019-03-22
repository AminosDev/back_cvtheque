package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Entretien;

public interface EntretienService {
	void saveEntretien(Entretien e);
	boolean deleteEntretien(Long id);
	void updateEntretien(Entretien e);
	List<Entretien> getAllEntretien();
	Optional<Entretien> getEntretien(Long id);

}
