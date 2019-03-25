package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.service.CvService;

import annotations.Dto;


@RestController
@RequestMapping("/Cv")
@CrossOrigin("*")
public class CvController {

	@Autowired 
	private CvService cr; 
	
	@GetMapping("/list")
	@Dto(cvDto.class)
	public List<Cv>getCvs(){
		return cr.getAllCv();
	}
	
	@GetMapping("/list/{id}")
	@Dto(cvDto.class)
	public Cv getCv(@PathVariable Long id){
		return cr.getCv(id).get();
	}
	
	@PostMapping("/save")
	public Cv createCv(@RequestBody Cv c){
		cr.saveCv(c);
		return c;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCv(@PathVariable Long id){
		cr.deleteCv(id);
		return true;
	}
	
	@PutMapping("/update")
	public Cv updateCv(@RequestBody Cv c){
		cr.saveCv(c);
		return c;
	}
}
