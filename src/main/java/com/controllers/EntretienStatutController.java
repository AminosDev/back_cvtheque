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

import com.models.EntretienStatut;
import com.repositories.EntretienStatutRepository;


@RestController
@RequestMapping("/EntretienStatut")
public class EntretienStatutController {

	@Autowired 
	private EntretienStatutRepository ep; 
	
	@GetMapping("/list")
	public List<EntretienStatut>getEntretienStatuts(){
		return ep.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<EntretienStatut> getEntretienStatut(@PathVariable Long id){
		return ep.findById(id);
	}
	
	@PostMapping("/save")
	public EntretienStatut createEntretienStatut(@RequestBody EntretienStatut e){
		return ep.save(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEntretienStatut(@PathVariable Long id){
		ep.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public EntretienStatut updateEntretienStatut(@RequestBody EntretienStatut e){
		return ep.save(e);
	}
}
