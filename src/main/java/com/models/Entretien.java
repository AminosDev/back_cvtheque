package com.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entretien {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_entretien; 
	private Date date_entretien;
	private int lu;
	private String remarque;
	
	public long getId_entretien() {
		return id_entretien;
	}
	
	public void setId_entretien(long id_entretien) {
		this.id_entretien = id_entretien;
	}
	
	public Date getDate_entretien() {
		return date_entretien;
	}
	
	public void setDate_entretien(Date date_entretien) {
		this.date_entretien = date_entretien;
	}
	
	public int getLu() {
		return lu;
	}
	
	public void setLu(int lu) {
		this.lu = lu;
	}
	
	public String getRemarque() {
		return remarque;
	}
	
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	
	public Entretien(Date date_entretien, int lu, String remarque) {
		super();
		this.date_entretien = date_entretien;
		this.lu = lu;
		this.remarque = remarque;
	}
	
	public Entretien() {
		super();
	}
	
	@Override
	public String toString() {
		return "Entretien [id_entretien=" + id_entretien + ", date_entretien=" + date_entretien + ", lu=" + lu
				+ ", remarque=" + remarque + "]";
	}
	
	
	
	
	
}
