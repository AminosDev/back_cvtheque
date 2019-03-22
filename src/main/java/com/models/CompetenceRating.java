package com.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class CompetenceRating {

	@EmbeddedId
	CompetenceRatingId id_competencerating;
	
	@ManyToOne
    @MapsId("id_candidat")
    @JoinColumn(name = "id_candidat")
    Candidat candidat;
 
    @ManyToOne
    @MapsId("id_competence")
    @JoinColumn(name = "id_competence")
    Competence competence;
 
    private int rating;

	public CompetenceRatingId getId_competencerating() {
		return id_competencerating;
	}

	public void setId_competencerating(CompetenceRatingId id_competencerating) {
		this.id_competencerating = id_competencerating;
	}

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public CompetenceRating(CompetenceRatingId id_competencerating, Candidat candidat, Competence competence,
			int rating) {
		super();
		this.id_competencerating = id_competencerating;
		this.candidat = candidat;
		this.competence = competence;
		this.rating = rating;
	}

	public CompetenceRating() {
		super();
	}
	
    
    
	
}
