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

import com.dto.cvDto;
import com.models.Cv;
import com.repositories.CvRepository;

import annotations.Dto;


@RestController
@RequestMapping("/Cv")
public class CvController {

	@Autowired 
	private CvRepository cr; 
	
	@GetMapping("/list")
	@Dto(cvDto.class)
	public List<Cv>getCvs(){
		return cr.findAll();
	}
	
	@GetMapping("/list/{id}")
	@Dto(cvDto.class)
	public Cv getCv(@PathVariable Long id){
		return cr.findById(id).get();
	}
	
	@PostMapping("/save")
	public Cv createCv(@RequestBody Cv c){
		return cr.save(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCv(@PathVariable Long id){
		cr.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Cv updateCv(@RequestBody Cv c){
		return cr.save(c);
	}
}
