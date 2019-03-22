package com.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name="LangueRating")
@Table(name="langue_rating")

public class LangueRating {
@EmbeddedId
private LangueRatingId id_langueRating;
@ManyToOne(fetch=FetchType.LAZY)
@MapsId("id_langue")
private Langue langue;

@ManyToOne(fetch=FetchType.LAZY)
@MapsId("id_condidat")
private Candidat condidat;
@Column(name = "LRating")
private int LRating;
public LangueRating(Langue langue, Candidat candidat, int rating) {
	super();
	this.langue = langue;
	this.condidat = candidat;
	LRating = rating;
}
public LangueRatingId getId_langueRating() {
	return id_langueRating;
}
public void setId_langueRating(LangueRatingId id_langueRating) {
	this.id_langueRating = id_langueRating;
}
public Langue getLangue() {
	return langue;
}
public void setLangue(Langue langue) {
	this.langue = langue;
}
public Candidat getCondidat() {
	return condidat;
}
public void setCondidat(Candidat condidat) {
	this.condidat = condidat;
}
public int getLRating() {
	return LRating;
}
public void setLRating(int lRating) {
	LRating = lRating;
}

public LangueRating(Langue langue, Candidat candidat) {
	super();
	this.langue = langue;
	this.condidat = candidat;
	this.id_langueRating=new LangueRatingId(candidat.getId_candidat(), langue.getId_langue());
}
public LangueRating() {
	super();
	
}

}
