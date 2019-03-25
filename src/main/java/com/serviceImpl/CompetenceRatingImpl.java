package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.CompetenceRating;
import com.repositories.CompetenceRatingRepository;
import com.service.CompetenceRatingService;

@Service
public class CompetenceRatingImpl implements CompetenceRatingService {

	
	@Autowired
	private CompetenceRatingRepository crr;

	@Override
	public void saveCompetenceRating(CompetenceRating cr) {
		crr.save(cr);
		
	}

	@Override
	public boolean deleteCompetenceRating(Long id) {
		// TODO Auto-generated method stub
		crr.deleteById(id);
		return true;
	}

	@Override
	public void updateCompetenceRating(CompetenceRating cr) {
		crr.save(cr);
		
	}

	@Override
	public List<CompetenceRating> getAllCompetenceRating() {
		// TODO Auto-generated method stub
		return crr.findAll();
	}

	@Override
	public Optional<CompetenceRating> getCompetenceRating(Long id) {
		// TODO Auto-generated method stub
		return crr.findById(id);
	}
	
}
