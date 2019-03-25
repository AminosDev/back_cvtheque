package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.NiveauEtude;
import com.repositories.NiveauEtudeRepository;
import com.service.NiveauEtudeService;

@Service
public class NiveauEtudeServiceImpl implements NiveauEtudeService{
	
	@Autowired 
	private NiveauEtudeRepository nr ;

	@Override
	public void saveNiveauEtude(NiveauEtude ne) {
		nr.save(ne);
		
	}

	@Override
	public boolean deleteNiveauEtude(Long id) {
		// TODO Auto-generated method stub
		nr.deleteById(id);
		return true ;
	}

	@Override
	public void updateNiveauEtude(NiveauEtude n) {
		nr.save(n);
		
	}

	@Override
	public List<NiveauEtude> getAllNiveauEtude() {
		// TODO Auto-generated method stub
		return nr.findAll();
	}

	@Override
	public Optional<NiveauEtude> getNiveauEtude(Long id) {
		// TODO Auto-generated method stub
		return nr.findById(id);
	}
	
	
	
	
}
