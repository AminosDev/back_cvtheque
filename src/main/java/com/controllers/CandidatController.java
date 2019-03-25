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

import com.models.Candidat;
import com.repositories.CandidatRepository;


@RestController
@RequestMapping("/Candidat")
@CrossOrigin("*")
public class CandidatController {

	@Autowired 
	private CandidatRepository cr; 
	
	@GetMapping("/list")
	public List<Candidat>getCandidats(){
		return cr.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Optional<Candidat> getCandidat(@PathVariable Long id){
		return cr.findById(id);
	}
	
	@PostMapping("/save")
	public Candidat createCandidat(@RequestBody Candidat c){
		return cr.save(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCandidat(@PathVariable Long id){
		cr.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Candidat updateCandidat(@RequestBody Candidat c){
		return cr.save(c);
	}
}
