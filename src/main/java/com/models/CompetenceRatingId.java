package com.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompetenceRatingId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "id_candidat")
	Long id_candidat;
	 
	@Column(name = "id_competence")
	Long id_competence;

	public Long getId_candidat() {
		return id_candidat;
	}

	public void setId_candidat(Long id_candidat) {
		this.id_candidat = id_candidat;
	}

	public Long getId_competence() {
		return id_competence;
	}

	public void setId_competence(Long id_competence) {
		this.id_competence = id_competence;
	}

	public CompetenceRatingId() {
		super();
	}

	public CompetenceRatingId(Long id_candidat, Long id_competence) {
		super();
		this.id_candidat = id_candidat;
		this.id_competence = id_competence;
	}
	
	
	
	
	    
}
