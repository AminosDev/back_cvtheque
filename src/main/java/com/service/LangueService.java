package com.service;

import java.util.List;
import java.util.Optional;

import com.models.Langue;

public interface LangueService {
	void saveLangue(Langue lanugue);
	boolean deleteLangue(Long id);
	void updateLangue(Langue langue);
	List<Langue> getAllLangue();
	Optional<Langue> getLangue(Long id);

}
