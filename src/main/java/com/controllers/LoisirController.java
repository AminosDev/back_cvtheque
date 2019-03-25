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

import com.dto.loisirDto;
import com.models.Loisir;
import com.repositories.LoisirRepository;

import annotations.Dto;


@RestController
@RequestMapping("/Loisir")
public class LoisirController {

	@Autowired 
	private LoisirRepository lp; 
	
	@GetMapping("/list")
	@Dto(loisirDto.class)
	public List<Loisir>getLoisirs(){
		return lp.findAll();
	}
	
	@GetMapping("/list/{id}")
	@Dto(loisirDto.class)
	public Loisir getLoisir(@PathVariable Long id){
		return lp.findById(id).get();
	}
	
	@PostMapping("/save")
	public Loisir createLoisir(@RequestBody Loisir l){
		return lp.save(l);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteLoisir(@PathVariable Long id){
		lp.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Loisir updateLoisir(@RequestBody Loisir l){
		return lp.save(l);
	}
}
