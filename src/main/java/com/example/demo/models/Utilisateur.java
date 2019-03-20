package com.example.demo.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id ; 
	private String nom ;
	private String prenom ;
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role ;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Utilisateur(String nom, String prenom , Role role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	
	
	
}
