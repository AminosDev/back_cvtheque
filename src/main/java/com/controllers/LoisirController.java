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

import com.dto.loisirDto;
import com.models.Loisir;
import com.repositories.LoisirRepository;
import com.service.LoisirService;

import annotations.Dto;


@RestController
@RequestMapping("/Loisir")
@CrossOrigin("*")
public class LoisirController {

	@Autowired 
	private LoisirService lp; 
	
	@GetMapping("/list")
	@Dto(loisirDto.class)
	public List<Loisir>getLoisirs(){
		return lp.getAllLoisir();
		}
	
	@GetMapping("/list/{id}")
	@Dto(loisirDto.class)
	public Loisir getLoisir(@PathVariable Long id){
		return lp.getLoisir(id).get();
	}
	
	@PostMapping("/save")
	public Loisir createLoisir(@RequestBody Loisir l){
		lp.saveLoisir(l);
		return l;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteLoisir(@PathVariable Long id){
		lp.deleteLoisir(id);
		return true;
	}
	
	@PutMapping("/update")
	public Loisir updateLoisir(@RequestBody Loisir l){
		lp.saveLoisir(l);
		return l;
	}
}
