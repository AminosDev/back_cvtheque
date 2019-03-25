package com.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.models.Candidat;
import com.models.Competence;

public class competanceRatingDto {
	
	@JsonIgnoreProperties({"rts","ratings"})
	private Competence competence; 
	
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;
	private  int rating;
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public Competence getCompetence() {
		return competence;
	}
	public void setCompetence(Competence competence) {
		this.competence = competence;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
	
	
}
