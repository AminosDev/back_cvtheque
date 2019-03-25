package com.dto;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Candidat;
import com.models.EntretienStatut;
import com.models.Utilisateur;

public class entretienDto {
	private long id_entretien; 
	private Date date_entretien;
	private int lu;
	private String remarque;
	private EntretienStatut entretienstatut;
	@JsonIgnoreProperties({"mdp","entretiens"})
	private Utilisateur utilisateur;
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;
	public long getId_entretien() {
		return id_entretien;
	}
	public void setId_entretien(long id_entretien) {
		this.id_entretien = id_entretien;
	}
	public Date getDate_entretien() {
		return date_entretien;
	}
	public void setDate_entretien(Date date_entretien) {
		this.date_entretien = date_entretien;
	}
	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public EntretienStatut getEntretienstatut() {
		return entretienstatut;
	}
	public void setEntretienstatut(EntretienStatut entretienstatut) {
		this.entretienstatut = entretienstatut;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
	
}
