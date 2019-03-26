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

import com.models.Role;
import com.repositories.RoleRepository;
import com.service.RoleService;


@RestController
@RequestMapping("/Role")
@CrossOrigin("*")
public class RoleController {

	@Autowired 
	private RoleService ro; 
	
	@GetMapping("/list")
	public List<Role>getRoles(){
		return ro.getAllRoles();
	}
	
	@GetMapping("/list/{id}")
	public Role getRole(@PathVariable Long id){
		return ro.getRole(id).get();
	}
	
	@PostMapping("/save")
	public Role createRole(@RequestBody Role R){
		ro.saveRole(R);
		return R;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteRole(@PathVariable Long id){
		ro.deleteRole(id);
		return true;
	}
	
	@PutMapping("/update")
	public Role updateRole(@RequestBody Role r){
		ro.saveRole(r);
		return r;
	}
}
