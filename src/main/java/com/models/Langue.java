package com.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.NaturalIdCache;

@Entity

public class Langue {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_langue; 
	private String langue;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attacher.langue")
	Set<LangueRating> LRating = new HashSet<LangueRating>(0);

	public Set<LangueRating> getLRating() {
		return LRating;
	}

	public void setLRating(Set<LangueRating> lRating) {
		LRating = lRating;
	}

	public long getId_langue() {
		return id_langue;
	}
	
	public void setId_langue(long id_langue) {
		this.id_langue = id_langue;
	}
	
	public String getLangue() {
		return langue;
	}
	
	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	@Override
	public String toString() {
		return "Langue [id_langue=" + id_langue + ", langue=" + langue + "]";
	}
	
	public Langue() {
		super();
	}
	
	public Langue(String langue) {
		super();
		this.langue = langue;
	}
	
	
	
	
}
