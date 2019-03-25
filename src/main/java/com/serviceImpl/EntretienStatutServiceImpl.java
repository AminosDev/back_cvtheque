package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.EntretienStatut;
import com.repositories.EntretienStatutRepository;
import com.service.EntretienStatutService;

@Service
public class EntretienStatutServiceImpl implements EntretienStatutService {
	
	@Autowired
	private EntretienStatutRepository er ;

	@Override
	public void saveEntretienStatut(EntretienStatut es) {
		er.save(es);
		
	}

	@Override
	public boolean deleteEntretienStatut(Long id) {
		er.deleteById(id);
		return true;
	}

	@Override
	public void updateEntretienStatut(EntretienStatut es) {
		er.save(es);
		
	}

	@Override
	public List<EntretienStatut> getAllEntretienStatut() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Optional<EntretienStatut> getEntretienStatut(Long id) {
		// TODO Auto-generated method stub
		return er.findById(id);
	}
	

}
