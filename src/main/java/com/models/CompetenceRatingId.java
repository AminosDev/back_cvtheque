package com.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompetenceRatingId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_candidat")
	private Candidat candidat;
	 
	@ManyToOne
	@JoinColumn(name = "id_competence")
	private Competence competence;

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	public CompetenceRatingId() {
		super();
	}

	public CompetenceRatingId(Candidat candidat, Competence competence) {
		super();
		this.candidat = candidat;
		this.competence = competence;
	}

	
	
	
	
	    
}
