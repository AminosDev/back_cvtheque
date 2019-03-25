package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Cv;
import com.repositories.CvRepository;
import com.service.CvService;

@Service
public class CvServiceImpl implements CvService {

	@Autowired
	private CvRepository cr ;
	@Override
	public void saveCv(Cv cv) {
		cr.save(cv);
		
	}

	@Override
	public boolean deleteCv(Long id) {
		cr.deleteById(id);
		return true ;
	}

	@Override
	public void updateCv(Cv cv) {
		cr.save(cv);
		
	}

	@Override
	public List<Cv> getAllCv() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Optional<Cv> getCv(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id);
	}

}
