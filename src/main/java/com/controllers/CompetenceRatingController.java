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

import com.dto.competanceRatingDto;

import com.dto.condidatDto;
import com.models.CompetenceRating;
import com.repositories.CompetenceRatingRepository;

import annotations.Dto;

@RestController
@RequestMapping("/CompetenceRating")
public class CompetenceRatingController {

		@Autowired 
		private CompetenceRatingRepository cr; 
		
		@GetMapping("/list")
		@Dto(competanceRatingDto.class)
		public List<CompetenceRating>getCompetences(){
			return cr.findAll();
		}
		
		@GetMapping("/list/{id}")
		@Dto(competanceRatingDto.class)
		public CompetenceRating getCompetence(@PathVariable Long id){
			return cr.findById(id).get();
		}
		
		@PostMapping("/save")
		public CompetenceRating createCompetence(@RequestBody CompetenceRating c){
			return cr.save(c);
		}
		
		@DeleteMapping("/delete/{id}")
		public Boolean deleteCompetence(@PathVariable Long id){
			cr.deleteById(id);
			return true;
		}
		
		@PutMapping("/update")
		public CompetenceRating updateCompetence(@RequestBody CompetenceRating c){
			return cr.save(c);
		}
	

}
