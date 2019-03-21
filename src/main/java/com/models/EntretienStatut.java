package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntretienStatut {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_entretienstatut; 
	private String entretienstatut;
	
	public long getId_entretienstatut() {
		return id_entretienstatut;
	}
	
	public void setId_entretienstatut(long id_entretienstatut) {
		this.id_entretienstatut = id_entretienstatut;
	}
	
	public String getEntretienstatut() {
		return entretienstatut;
	}
	
	public void setEntretienstatut(String entretienstatut) {
		this.entretienstatut = entretienstatut;
	}
	
	public EntretienStatut(String entretienstatut) {
		super();
		this.entretienstatut = entretienstatut;
	}
	
	public EntretienStatut() {
		super();
	}
	
	@Override
	public String toString() {
		return "EntretienStatut [id_entretienstatut=" + id_entretienstatut + ", entretienstatut=" + entretienstatut + "]";
	}
	
	

}
