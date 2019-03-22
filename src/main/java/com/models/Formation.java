package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_formation; 
	private String formation;
	
	@ManyToOne
	@JoinColumn(name="candidat_id")
	private Candidat candidat;
		
	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public long getId_formation() {
		return id_formation;
	}
	
	public void setId_formation(long id_formation) {
		this.id_formation = id_formation;
	}
	
	public String getFormation() {
		return formation;
	}
	
	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	public Formation(String formation, Candidat candidat) {
		super();
		this.formation = formation;
		this.candidat = candidat;
	}

	
	@Override
	public String toString() {
		return "Formation [id_formation=" + id_formation + ", formation=" + formation + "]";
	}
	
	public Formation() {
		super();
	}
	
	

}
