package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Loisir;
import com.repositories.LoisirRepository;
import com.service.LoisirService;

@Service
public class LoisirServiceImpl implements LoisirService {
	
	@Autowired
	private LoisirRepository lr ;

	@Override
	public void saveLoisir(Loisir loisir) {
		lr.save(loisir);
		
	}

	@Override
	public boolean deleteLoisir(Long id) {
		lr.deleteById(id);
		return true;
	}

	@Override
	public void updateLoisir(Loisir loisir) {
		lr.save(loisir);
		
	}

	@Override
	public List<Loisir> getAllLoisir() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public Optional<Loisir> getLoisir(Long id) {
		// TODO Auto-generated method stub
		return lr.findById(id);
	}

}
