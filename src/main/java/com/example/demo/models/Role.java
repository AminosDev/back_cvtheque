package com.example.demo.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id ; 
	private String nom ;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Role(String nom, String decription) {
		super();
		this.nom = nom;
		this.decription = decription;
	}
	private String decription;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}

}
