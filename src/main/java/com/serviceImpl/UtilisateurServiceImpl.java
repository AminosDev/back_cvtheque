package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Utilisateur;
import com.repositories.UtilisateurRepository;
import com.service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository ur ;
	@Override
	public void saveUtilisateur(Utilisateur u) {
		ur.save(u);
		
	}

	@Override
	public boolean deleteUtilisateur(Long id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
		return true;
	}

	@Override
	public void updateUtilisateur(Utilisateur u) {
		ur.save(u);
		
	}

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public Optional<Utilisateur> getUtilisateur(Long id) {
		// TODO Auto-generated method stub
		return ur.findById(id);
	}

}
