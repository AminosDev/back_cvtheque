package com.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Candidat;
import com.models.Competence;
import com.models.Langue;

public class langueRatingDto {
	

	@JsonIgnoreProperties({"lrating"})
	private Langue langue; 
	
	@JsonIgnoreProperties({"cin","date_naissance","lien_photo","mail","adresse","telephone","situation_famille","niveauEtude","lratings","entretiens","ratings","loisirs","formations","cvs"})
	private Candidat candidat;
	private  int rating;
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	public Langue getLangue() {
		return langue;
	}
	public void setLangue(Langue langue) {
		this.langue = langue;
	}
	public Candidat getCandidat() {
		return candidat;
	}
	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
	
}
