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

import com.models.Formation;
import com.repositories.FormationRepository;


@RestController
@RequestMapping("/Formation")
public class FormationController {

	@Autowired 
	private FormationRepository fp; 
	
	@GetMapping("/list")
	public List<Formation>getFormations(){
		return fp.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<Formation> getFormation(@PathVariable Long id){
		return fp.findById(id);
	}
	
	@PostMapping("/save")
	public Formation createFormation(@RequestBody Formation f){
		return fp.save(f);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteFormation(@PathVariable Long id){
		fp.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Formation updateFormation(@RequestBody Formation f){
		return fp.save(f);
	}
}