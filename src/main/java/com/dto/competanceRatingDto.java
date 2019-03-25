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
		
	
	
	
}
