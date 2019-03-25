package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Langue;
import com.repositories.LangueRepository;
import com.service.LangueService;

@Service
public class LangueServiceImpl implements LangueService{
	
	@Autowired	
	private LangueRepository lr ;

	@Override
	public void saveLangue(Langue langue) {
		lr.save(langue);
		
	}

	@Override
	public boolean deleteLangue(Long id) {
		lr.deleteById(id);
		return true;
	}

	@Override
	public void updateLangue(Langue langue) {
		lr.save(langue);
		
	}

	@Override
	public List<Langue> getAllLangue() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public Optional<Langue> getLangue(Long id) {
		// TODO Auto-generated method stub
		return lr.findById(id);
	}
	

}
