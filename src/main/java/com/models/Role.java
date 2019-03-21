package com.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_role; 
	private String nom;
	private String decription;

	public Role() {
		super();
	}
	
	public long getId() {
		return id_role;
	}
	
	public void setId(long id_role) {
		this.id_role = id_role;
	}
	
	public Role(String nom, String decription) {
		super();
		this.nom = nom;
		this.decription = decription;
	}

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
