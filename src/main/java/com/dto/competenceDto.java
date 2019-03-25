package com.dto;

import java.util.Set;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Rt;

public class competenceDto {
	private long id_competence; 
	private String competence;
	@JsonIgnoreProperties({"mdp","role","entretiens"})
	Set<utilisateurDto> rts;
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
	public Set<utilisateurDto> getRts() {
		return rts;
	}
	public void setRts(Set<utilisateurDto> rts) {
		this.rts = rts;
	}
	
}
