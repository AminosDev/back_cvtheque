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

import com.models.NiveauEtude;
import com.repositories.NiveauEtudeRepository;
import com.service.NiveauEtudeService;


@RestController
@RequestMapping("/NiveauEtude")
@CrossOrigin("*")
public class NiveauEtudeController {

	@Autowired 
	private NiveauEtudeService np; 
	
	@GetMapping("/list")
	public List<NiveauEtude>getNiveauEtudes(){
		return np.getAllNiveauEtude();
	}
	
	@GetMapping("/list/{id}")
	public NiveauEtude getNiveauEtude(@PathVariable Long id){
		return np.getNiveauEtude(id).get();
	}
	
	@PostMapping("/save")
	public NiveauEtude createNiveauEtude(@RequestBody NiveauEtude n){
		np.saveNiveauEtude(n);
		return n ;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteNiveauEtude(@PathVariable Long id){
		np.deleteNiveauEtude(id);
		return true;
	}
	
	@PutMapping("/update")
	public NiveauEtude updateNiveauEtude(@RequestBody NiveauEtude n){
		np.saveNiveauEtude(n);
		return n ;
	}
}
