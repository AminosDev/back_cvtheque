package com.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Competence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_competence; 
	private String competence;
	
	@ManyToMany(mappedBy = "competences")
	Set<Rt> rts;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attacher.competence")
    Set<CompetenceRating> ratings = new HashSet<CompetenceRating>(0);
		
	public Set<CompetenceRating> getRatings() {
		return ratings;
	}

	public void setRatings(Set<CompetenceRating> ratings) {
		this.ratings = ratings;
	}

	public Set<Rt> getRts() {
		return rts;
	}

	public void setRts(Set<Rt> rts) {
		this.rts = rts;
	}

	public long getId_competence() {
		return id_competence;
	}
	
	public void setId_competence(long id_competence) {
		this.id_competence = id_competence;
	}
	
	public String getCompetence() {
		return competence;
	}
	
	public void setCompetence(String competence) {
		this.competence = competence;
	}
	
	public Competence(String competence) {
		super();
		this.competence = competence;
	}
	
	public Competence() {
		super();
	}
	
	@Override
	public String toString() {
		return "Competence [id_competence=" + id_competence + ", competence=" + competence + "]";
	}
	
	

}
