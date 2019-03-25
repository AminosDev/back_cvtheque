package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Cv;



public interface CvService {
	
	
	
	void saveCv(Cv cv);
	boolean deleteCv(Long id);
	void updateCv(Cv cv);
	List<Cv> getAllCv();
	Optional<Cv> getCv(Long id);

}
