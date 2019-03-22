package com.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cv {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_cv; 
	private String lien_cv;
	private Date date_cv;
	@ManyToOne
	private Candidat condidat;
	public Candidat getCondidat() {
		return condidat;
	}

	public void setCondidat(Candidat condidat) {
		this.condidat = condidat;
	}

	public long getId_cv() {
		return id_cv;
	}
	
	public void setId_cv(long id_cv) {
		this.id_cv = id_cv;
	}
	
	public String getLien_cv() {
		return lien_cv;
	}
	
	public void setLien_cv(String lien_cv) {
		this.lien_cv = lien_cv;
	}
	
	public Date getDate_cv() {
		return date_cv;
	}
	
	public void setDate_cv(Date date_cv) {
		this.date_cv = date_cv;
	}
	
	public Cv(String lien_cv, Date date_cv) {
		super();
		this.lien_cv = lien_cv;
		this.date_cv = date_cv;
	}
	
	public Cv() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cv [id_cv=" + id_cv + ", lien_cv=" + lien_cv + ", date_cv=" + date_cv + "]";
	}
	
	
	
	
}
