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

import com.models.Entretien;
import com.repositories.EntretienRepository;


@RestController
@RequestMapping("/Entretien")
public class EntretienController {

	@Autowired 
	private EntretienRepository ep; 
	
	@GetMapping("/list")
	public List<Entretien>getEntretiens(){
		return ep.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<Entretien> getEntretien(@PathVariable Long id){
		return ep.findById(id);
	}
	
	@PostMapping("/save")
	public Entretien createEntretien(@RequestBody Entretien e){
		return ep.save(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEntretien(@PathVariable Long id){
		ep.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Entretien updateEntretien(@RequestBody Entretien e){
		return ep.save(e);
	}
}