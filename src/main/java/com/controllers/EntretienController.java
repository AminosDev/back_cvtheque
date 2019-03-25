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

import com.dto.entretienDto;
import com.models.Entretien;
import com.repositories.EntretienRepository;
import com.service.EntretienService;

import annotations.Dto;


@RestController
@RequestMapping("/Entretien")
@CrossOrigin("*")
public class EntretienController {

	@Autowired 
	private EntretienService ep; 
	
	@GetMapping("/list")
	@Dto(entretienDto.class)
	public List<Entretien>getEntretiens(){
		return ep.getAllEntretien();
	}
	
	@GetMapping("/list/{id}")
	@Dto(entretienDto.class)
	public Entretien getEntretien(@PathVariable Long id){
		return ep.getEntretien(id).get();
	}
	
	@PostMapping("/save")
	public Entretien createEntretien(@RequestBody Entretien e){
		 ep.saveEntretien(e);
		return e ;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEntretien(@PathVariable Long id){
		ep.deleteEntretien(id);
		return true;
	}
	
	@PutMapping("/update")
	public Entretien updateEntretien(@RequestBody Entretien e){
		 ep.saveEntretien(e);
			return e ;
	}
}
