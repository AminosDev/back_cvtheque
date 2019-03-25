package com.dto;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Candidat;

public class formationDto {
	private long id_formation; 
	private String formation;
	private String Description;
	private Date DateDebut;
	private Date DateFin;
	
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;

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

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
		
}
