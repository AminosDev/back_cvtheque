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

import com.models.Langue;
import com.repositories.LangueRepository;


@RestController
@RequestMapping("/Langue")
public class LangueController {

	@Autowired 
	private LangueRepository lp; 
	
	@GetMapping("/list")
	public List<Langue>getLangues(){
		return lp.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Langue getLangue(@PathVariable Long id){
		return lp.findById(id).get();
	}
	
	@PostMapping("/save")
	public Langue createLangue(@RequestBody Langue l){
		return lp.save(l);
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteLangue(@PathVariable Long id){
		lp.deleteById(id);
		return true;
	}
	
	@PutMapping("/update")
	public Langue updateLangue(@RequestBody Langue l){
		return lp.save(l);
	}
}
