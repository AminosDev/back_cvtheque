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

import com.models.EntretienStatut;
import com.repositories.EntretienStatutRepository;
import com.service.EntretienStatutService;


@RestController
@RequestMapping("/EntretienStatut")
@CrossOrigin("*")
public class EntretienStatutController {

	@Autowired 
	private EntretienStatutService ep; 
	
	@GetMapping("/list")
	public List<EntretienStatut>getEntretienStatuts(){
		return ep.getAllEntretienStatut();
	}
	
	@GetMapping("/list/{id}")
	public EntretienStatut getEntretienStatut(@PathVariable Long id){
		return ep.getEntretienStatut(id).get();
	}
	
	@PostMapping("/save")
	public EntretienStatut createEntretienStatut(@RequestBody EntretienStatut e){
		ep.saveEntretienStatut(e);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEntretienStatut(@PathVariable Long id){
		ep.deleteEntretienStatut(id);
		return true;
	}
	
	@PutMapping("/update")
	public EntretienStatut updateEntretienStatut(@RequestBody EntretienStatut e){
		ep.saveEntretienStatut(e);
		return e;
	}
}
