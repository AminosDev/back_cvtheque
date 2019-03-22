package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Entretien;
import com.repositories.EntretienRepository;
import com.service.EntretienService;

@Service
public class EntretienServiceImpl implements EntretienService {
	
	@Autowired
	private EntretienRepository er ;
	
	@Override
	public void saveEntretien(Entretien e) {
		er.save(e);
		
	}

	@Override
	public boolean deleteEntretien(Long id) {
	er.deleteById(id);
		return true;
	}

	@Override
	public void updateEntretien(Entretien e) {
		er.save(e);
		
	}

	@Override
	public List<Entretien> getAllEntretien() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Optional<Entretien> getEntretien(Long id) {
		// TODO Auto-generated method stub
		return er.findById(id);
	}

}
