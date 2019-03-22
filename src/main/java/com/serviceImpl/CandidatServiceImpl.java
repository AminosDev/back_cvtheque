package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Candidat;
import com.repositories.CandidatRepository;
import com.service.CandidatService;

 @Service
public class CandidatServiceImpl implements CandidatService {

	@Autowired 
	private CandidatRepository cr ;
	
	public void saveCandidat(Candidat candidat) {
		cr.save(candidat);
	}

	@Override
	public boolean deleteCandidat(Long id) {
		cr.deleteById(id);
		return true;
	}

	@Override
	public void updateCandidat(Candidat c) {
		cr.save(c);
		
	}

	@Override
	public List<Candidat> getAllCandidat() {
		
		return cr.findAll();
	}

	@Override
	public Optional<Candidat> getCandidat(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}
	
	
	
}
