package com.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Loisir {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_loisir; 
	private String loisir;
	
	
	public long getId_loisir() {
		return id_loisir;
	}
	
	public void setId_loisir(long id_loisir) {
		this.id_loisir = id_loisir;
	}
	
	public String getLoisir() {
		return loisir;
	}
	
	public void setLoisir(String loisir) {
		this.loisir = loisir;
	}

	public Loisir(String loisir) {
		super();
		this.loisir = loisir;
	}

	public Loisir() {
		super();
	}

	@Override
	public String toString() {
		return "Loisir [id_loisir=" + id_loisir + ", loisir=" + loisir + "]";
	}
	
	
	
	

}
