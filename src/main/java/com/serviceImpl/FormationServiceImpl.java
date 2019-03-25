package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Formation;
import com.repositories.FormationRepository;
import com.service.FormationService;

@Service
public class FormationServiceImpl implements FormationService {

	@Autowired 
	private FormationRepository fr ;

	@Override
	public void saveFormation(Formation formation) {
		fr.save(formation);
		
	}

	@Override
	public boolean deleteFormation(Long id) {
		fr.deleteById(id);
		return true;
	}

	@Override
	public void updateFormation(Formation f) {
		fr.save(f);
		
	}

	@Override
	public List<Formation> getAllFormation() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}

	@Override
	public Optional<Formation> getFormation(Long id) {
		// TODO Auto-generated method stub
		return fr.findById(id);
	}
	
	
}
