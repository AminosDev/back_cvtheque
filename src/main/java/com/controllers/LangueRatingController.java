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


import com.dto.langueRatingDto;

import com.models.LangueRating;
import com.repositories.LangueRatingRepository;
import com.service.LangueRatingService;

import annotations.Dto;

@RestController
@RequestMapping("/LangueRating")
public class LangueRatingController {
	@Autowired
	private LangueRatingService lrc;
	@GetMapping("/list")
	@Dto(langueRatingDto.class)
	public List<LangueRating>getLangueRating(){
		return lrc.getAllLangueRating();
	}
	
	@GetMapping("/list/{id}")
	@Dto(langueRatingDto.class)
	public LangueRating getLangueRating(@PathVariable Long id){
		return lrc.getLangueRating(id).get();
	}
	
	@PostMapping("/save")
	public LangueRating createLangueRating(@RequestBody LangueRating e){
		lrc.saveLangueRating(e);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteLangueRating(@PathVariable Long id){
		lrc.deleteLangueRating(id);
		return true;
	}
	
	@PutMapping("/update")
	public LangueRating updateLangueRating(@RequestBody LangueRating e){
		lrc.saveLangueRating(e);
		return e;
	}
	
	
}
