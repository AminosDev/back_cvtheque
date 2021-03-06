package com.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_formation; 
	private String formation;
	private String Description;
	private Date DateDebut;
	private Date DateFin;
	
	@ManyToOne
	@JoinColumn(name="id_candidat")
	private Candidat candidat;
		
	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public long getId_formation() {
		return id_formation;
	}
	
	public void setId_formation(long id_formation) {
		this.id_formation = id_formation;
	}
	
	public String getFormation() {
		return formation;
	}
	
	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	
	
	
	
	public Formation(String formation, String description, Date dateDebut, Date dateFin, Candidat candidat) {
		super();
		this.formation = formation;
		Description = description;
		DateDebut = dateDebut;
		DateFin = dateFin;
		this.candidat = candidat;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public Formation() {
		super();
	}
	
	

}
