package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loisir {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_loisir; 
	private String loisir;
	
	@ManyToOne
	@JoinColumn(name="id_candidat")
	private Candidat candidat;	
	
	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public long getId_loisir() {
		return id_loisir;
	}
	
	public void setId_loisir(long id_loisir) {
		this.id_loisir = id_loisir;
	}
	
	public String getLoisir() {
		return loisir;
	}
	
	public void setLoisir(String loisir) {
		this.loisir = loisir;
	}

	public Loisir(String loisir, Candidat candidat) {
		super();
		this.loisir = loisir;
		this.candidat = candidat;
	}

	public Loisir() {
		super();
	}

	@Override
	public String toString() {
		return "Loisir [id_loisir=" + id_loisir + ", loisir=" + loisir + "]";
	}
	
	
	
	

}
