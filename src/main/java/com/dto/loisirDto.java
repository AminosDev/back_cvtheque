package com.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Candidat;

public class loisirDto {

	
	private long id_loisir; 
	private String loisir;
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;

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

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}	
	
}
