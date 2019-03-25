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

import com.models.NiveauEtude;
import com.repositories.NiveauEtudeRepository;


@RestController
@RequestMapping("/NiveauEtude")
public class NiveauEtudeController {

	@Autowired 
	private NiveauEtudeRepository np; 
	
	@GetMapping("/list")
	public List<NiveauEtude>getNiveauEtudes(){
		return np.findAll();
	}
	
	@GetMapping("/list/{id}")
	public NiveauEtude getNiveauEtude(@PathVariable Long id){
		return np.findById(id).get();
	}
	
	@PostMapping("/save")
	public NiveauEtude createNiveauEtude(@RequestBody NiveauEtude n){
		return np.save(n);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteNiveauEtude(@PathVariable Long id){
		np.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public NiveauEtude updateNiveauEtude(@RequestBody NiveauEtude n){
		return np.save(n);
	}
}
