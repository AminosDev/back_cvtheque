package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_formation; 
	private String formation;
	
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
	
	public Formation(String formation) {
		super();
		this.formation = formation;
	}
	
	@Override
	public String toString() {
		return "Formation [id_formation=" + id_formation + ", formation=" + formation + "]";
	}
	
	public Formation() {
		super();
	}
	
	

}
