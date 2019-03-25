package com.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Candidat;

public class cvDto {

	private long id_cv; 
	private String lien_cv;
	private Date date_cv;
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;

	public long getId_cv() {
		return id_cv;
	}

	public void setId_cv(long id_cv) {
		this.id_cv = id_cv;
	}

	public String getLien_cv() {
		return lien_cv;
	}

	public void setLien_cv(String lien_cv) {
		this.lien_cv = lien_cv;
	}

	public Date getDate_cv() {
		return date_cv;
	}

	public void setDate_cv(Date date_cv) {
		this.date_cv = date_cv;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
}
