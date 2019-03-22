package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Candidat;
import com.repositories.CandidatRepository;

 @Service
public class CandidatServiceImpl implements CandidatService {

	@Autowired 
	private CandidatRepository cr ;
	
	public void save(Candidat candidat) {
		cr.save(candidat);
	}
	
	
	
}
