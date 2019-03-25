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

import com.dto.competenceDto;
import com.models.Competence;
import com.repositories.CompetenceRepository;
import com.service.CompetenceService;

import annotations.Dto;


@RestController
@RequestMapping("/Competence")
public class CompetenceController {

	@Autowired 
	private CompetenceService cr; 
	
	@GetMapping("/list")
	@Dto(competenceDto.class)
	public List<Competence>getCompetences(){
		return cr.getAllCompetence();
	}
	
	@GetMapping("/list/{id}")
	@Dto(competenceDto.class)
	public Competence getCompetence(@PathVariable Long id){
		return cr.getCompetence(id).get();
	}
	
	@PostMapping("/save")
	public Competence createCompetence(@RequestBody Competence c){
		cr.saveCompetence(c);
		return c;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCompetence(@PathVariable Long id){
		cr.deleteCompetence(id);
		return true;
	}
	
	@PutMapping("/update")
	public Competence updateCompetence(@RequestBody Competence c){
		cr.saveCompetence(c);
		return c;
	}
}
