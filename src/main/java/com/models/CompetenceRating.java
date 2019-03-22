package com.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CompetenceRating {

	@Id
	@JsonIgnore
	private CompetenceRatingId attacher = new CompetenceRatingId();
 
    private int rating; 

	public CompetenceRating(CompetenceRatingId attacher, int rating) {
		super();
		this.attacher = attacher;
		this.rating = rating;
	}

	public void setCandidat(Candidat candidat) 
	{
		attacher.setCandidat(candidat);
	}
	
	public void setCompetence(Competence competence)
	{
		attacher.setCompetence(competence);
	}
	
	public Candidat getCandidat() {
		return attacher.getCandidat();
	}
	
	public Competence getCompetence() {
		return attacher.getCompetence();
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public CompetenceRating() {
		super();
	}

	
    
	
}
