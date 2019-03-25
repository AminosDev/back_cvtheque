package com.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Rt extends Utilisateur{

	@Override
	public String toString() {
		return "Rt [competences=" + competences  + super.toString() + "]";
	}

	@ManyToMany
	@JoinTable(
	name = "rt_competence", 
	joinColumns = {@JoinColumn(name = "id_rt")}, 
	inverseJoinColumns = {@JoinColumn(name = "id_competence")})
    Set<Competence> competences;

	public Set<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}

	public Rt() {
		super();
	}

	public Rt(String nom, String prenom, String mail, String lien_image, Date last_login, String matricule, String mdp,
			Role role) {
		super(nom, prenom, mail, lien_image, last_login, matricule, mdp, role);
	}	
	
	
}
