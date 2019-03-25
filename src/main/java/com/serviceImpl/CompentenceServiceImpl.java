package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Competence;
import com.repositories.CompetenceRepository;
import com.service.CompetenceService;

@Service
public class CompentenceServiceImpl implements CompetenceService {

	@Autowired 
	private CompetenceRepository cr ;
		
	@Override
	public void saveCompetence(Competence c) {
		cr.save(c);
		
	}

	@Override
	public boolean deleteCompetence(Long id) {
		cr.deleteById(id);
		return true;
	}

	@Override
	public void updateCompetence(Competence c) {
		cr.save(c);
		
	}

	@Override
	public List<Competence> getAllCompetence() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Optional<Competence> getCompetence(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}

}
