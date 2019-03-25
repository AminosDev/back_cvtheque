package com.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LangueRatingId  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "id_candidat")
	private Candidat candidat;
	 
	@Override
	public String toString() {
		return "LangueRatingId [candidat=" + candidat + ", langue=" + langue + "]";
	}

	@ManyToOne
	@JoinColumn(name = "id_langue")
	private Langue langue;

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Langue getLangue() {
		return this.langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public LangueRatingId() {
		super();
	}

	public LangueRatingId(Langue langue, Candidat candidat) {
		super();
		this.candidat = candidat;
		this.langue = langue;
	}

}
