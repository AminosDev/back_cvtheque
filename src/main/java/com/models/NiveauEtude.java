package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NiveauEtude {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_niveauetude; 
	private String niveauetude;
	
	public long getId_niveauetude() {
		return id_niveauetude;
	}
	
	public void setId_niveauetude(long id_niveauetude) {
		this.id_niveauetude = id_niveauetude;
	}
	
	public String getNiveauetude() {
		return niveauetude;
	}
	
	public void setNiveauetude(String niveauetude) {
		this.niveauetude = niveauetude;
	}
	
	public NiveauEtude(String niveauetude) {
		super();
		this.niveauetude = niveauetude;
	}
	
	@Override
	public String toString() {
		return "NiveauEtude [id_niveauetude=" + id_niveauetude + ", niveauetude=" + niveauetude + "]";
	}
	
	public NiveauEtude() {
		super();
	}
	
	
	
	
	
}
