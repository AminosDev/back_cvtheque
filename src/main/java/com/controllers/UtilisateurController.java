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

import com.dto.utilisateurDto;
import com.models.Utilisateur;
import com.repositories.UtilisateurRepository;
import com.service.UtilisateurService;

import annotations.Dto;


@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {

	
	@Autowired
	private UtilisateurService ur;
	
	@GetMapping("/list")
	@Dto(utilisateurDto.class)
	public List<Utilisateur> getUtilisateur(){
		return ur.getAllUtilisateur();
	}
	
	@GetMapping("/list/{id}")
	@Dto(utilisateurDto.class)
	public Utilisateur getUser(@PathVariable Long id){
		return ur.getUtilisateur(id).get();
	}
	
	@PostMapping("/save")
	public Utilisateur createUser(@RequestBody Utilisateur u){
		ur.saveUtilisateur(u);
		return u;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteUtilisateur(@PathVariable Long id){
		ur.deleteUtilisateur(id);
		return true;
	}
	@PutMapping("/update")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur U){
		ur.saveUtilisateur(U);
		return U;
	}
	
	
	
}
