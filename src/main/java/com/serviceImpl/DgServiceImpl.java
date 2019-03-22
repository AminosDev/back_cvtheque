package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Dg;
import com.repositories.DgRepository;
import com.service.DgService;

@Service
public class DgServiceImpl implements DgService {

	
	@Autowired
	private DgRepository dr;
	@Override
	public void saveDg(Dg d) {
		dr.save(d);
		
	}

	@Override
	public boolean deleteDg(Long id) {
		dr.deleteById(id);
		return true;
	}

	@Override
	public void updateDg(Dg d) {
		dr.save(d);
		
	}

	@Override
	public List<Dg> getAllDg() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Optional<Dg> getDg(Long id) {
		// TODO Auto-generated method stub
		return dr.findById(id);
	}

}
