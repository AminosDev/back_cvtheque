package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.LangueRating;
import com.repositories.LangueRatingRepository;
import com.service.LangueRatingService;

@Service
public class LangueRatingServiceImpl implements LangueRatingService{

	@Autowired
	private LangueRatingRepository lrr ;

	@Override
	public void saveLangueRating(LangueRating langueR) {
		lrr.save(langueR);
		
	}

	@Override
	public boolean deleteLangueRating(Long id) {
		lrr.deleteById(id);
		return true;
	}

	@Override
	public void updateLangueRating(LangueRating langueR) {
		lrr.save(langueR);
		
	}

	@Override
	public List<LangueRating> getAllLangueRating() {
		// TODO Auto-generated method stub
		return lrr.findAll();
	}

	@Override
	public Optional<LangueRating> getLangueRating(Long id) {
		// TODO Auto-generated method stub
		return lrr.findById(id);
	}
	
}
