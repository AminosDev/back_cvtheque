package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Utilisateur;

public interface UtilisateurService {

	void saveUtilisateur(Utilisateur u);
	boolean deleteUtilisateur(Long id);
	void updateUtilisateur(Utilisateur u);
	List<Utilisateur> getAllUtilisateur();
	Optional<Utilisateur> getUtilisateur(Long id);
}
