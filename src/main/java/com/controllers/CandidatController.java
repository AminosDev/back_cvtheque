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

import com.dto.condidatDto;
import com.models.Candidat;
import com.repositories.CandidatRepository;
import com.service.CandidatService;

import annotations.Dto;


@RestController
@RequestMapping("/Candidat")
@CrossOrigin("*")
public class CandidatController {

	@Autowired 
	private CandidatService cr; 
	
	@GetMapping("/list")
	@Dto(condidatDto.class)
	public List<Candidat>getCandidats(){
		return cr.getAllCandidat();
	}
	
	@GetMapping("/list/{id}")
	@Dto(condidatDto.class)
	public Candidat getCandidat(@PathVariable Long id){
		return cr.findById(id).get();
	}
	
	@PostMapping("/save")
	public Candidat createCandidat(@RequestBody Candidat c){
		cr.saveCandidat(c);
		return c;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCandidat(@PathVariable Long id){
		cr.deleteCandidat(id);
		return true;
	}
	
	@PutMapping("/update")
	public Candidat updateCandidat(@RequestBody Candidat c){
		 cr.updateCandidat(c);
		return c ;
	}
}
