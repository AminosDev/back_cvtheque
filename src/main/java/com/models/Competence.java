package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_competence; 
	private String competence;
	
	public long getId_competence() {
		return id_competence;
	}
	
	public void setId_competence(long id_competence) {
		this.id_competence = id_competence;
	}
	
	public String getCompetence() {
		return competence;
	}
	
	public void setCompetence(String competence) {
		this.competence = competence;
	}
	
	public Competence(String competence) {
		super();
		this.competence = competence;
	}
	
	public Competence() {
		super();
	}
	
	@Override
	public String toString() {
		return "Competence [id_competence=" + id_competence + ", competence=" + competence + "]";
	}
	
	

}
