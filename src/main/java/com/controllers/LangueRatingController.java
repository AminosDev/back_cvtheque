package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Cv;
import com.models.Entretien;
import com.models.LangueRating;

@RestController
@RequestMapping("/LangueRating")
public class LangueRatingController {
	@Autowired
	private LangueRatingRepository lrc;
	@GetMapping("/list")
	public List<LangueRating>getLangueRating(){
		return lrc.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<LangueRating> getEntretien(@PathVariable Long id){
		return lrc.findById(id);
	}
	
	@PostMapping("/save")
	public LangueRating createLangueRating(@RequestBody LangueRating e){
		return lrc.save(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteLangueRating(@PathVariable Long id){
		lrc.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public LangueRating updateLangueRating(@RequestBody LangueRating e){
		return lrc.save(e);
	}
	
	
}
