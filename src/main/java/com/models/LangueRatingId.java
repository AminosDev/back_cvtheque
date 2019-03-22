package com.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LangueRatingId  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="id_condidat")
	Long id_condidat;
	@Column(name="id_langue")
	Long id_langue;
	public Long getId_langue() {
		return id_langue;
	}
	public Long getId_condidat() {
		return id_condidat;
	}
	public void setId_condidat(Long id_condidat) {
		this.id_condidat = id_condidat;
	}
	public void setId_langue(Long id_competence) {
		this.id_langue = id_competence;
	}
	public LangueRatingId(Long id_candidat, Long id_competence) {
		super();
		this.id_condidat = id_candidat;
		this.id_langue = id_competence;
	}
	public LangueRatingId() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_condidat == null) ? 0 : id_condidat.hashCode());
		result = prime * result + ((id_langue == null) ? 0 : id_langue.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LangueRatingId other = (LangueRatingId) obj;
		if (id_condidat == null) {
			if (other.id_condidat != null)
				return false;
		} else if (!id_condidat.equals(other.id_condidat))
			return false;
		if (id_langue == null) {
			if (other.id_langue != null)
				return false;
		} else if (!id_langue.equals(other.id_langue))
			return false;
		return true;
	}
	
}
