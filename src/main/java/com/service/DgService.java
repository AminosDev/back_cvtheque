package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Dg;

public interface DgService {

	void saveDg(Dg d);
	boolean deleteDg(Long id);
	void updateDg(Dg d);
	List<Dg> getAllDg();
	Optional<Dg> getDg(Long id);
}
