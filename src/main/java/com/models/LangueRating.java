package com.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LangueRating {
	
	@Id
	@JsonIgnore
	private LangueRatingId attacher = new LangueRatingId();
	
	private int LRating ;
	
	public void setCandidat(Candidat c) {
		attacher.setCandidat(c);
	}
	public void setLangue(Langue l) {
		attacher.setLangue(l);
	}
	public void getCandidat() {this.attacher.getCandidat();}
	
	public void getLangue() {this.attacher.getLangue();}
	
	public int getLRating() {
		return LRating;
	}
	public void setLRating(int lRating) {
		LRating = lRating;
	}
	public LangueRating(LangueRatingId attacher, int lRating) {
		super();
		this.attacher = attacher;
		LRating = lRating;
	}
	public LangueRating() {
		super();
	}
	
}
