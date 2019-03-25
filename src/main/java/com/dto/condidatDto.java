package com.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.models.CompetenceRating;
import com.models.Cv;
import com.models.Entretien;
import com.models.Formation;
import com.models.LangueRating;
import com.models.Loisir;
import com.models.NiveauEtude;

import annotations.Dto;

public class condidatDto {
	
	private long id_candidat; 
	private String nom;
	private String prenom;
	private String cin;
	private Date date_naissance;
	private String lien_photo;
	private String mail;
	private String adresse;
	private String telephone;
	private int situation_famille;
	private  NiveauEtude niveauEtude ;
	
	@JsonIgnoreProperties({"candidat"})
	private Set<langueRatingDto> Lratings ;
	@JsonIgnoreProperties({"candidat"})
    private Set<entretienDto> entretiens;
	@JsonIgnoreProperties({"candidat"})
	private Set<competanceRatingDto> ratings;
	@JsonIgnoreProperties({"candidat"})
	private Set<Loisir> loisirs;
	@JsonIgnoreProperties({"candidat"})
	private Set<Formation> formations;
	@JsonIgnoreProperties({"candidat"})
	private Set<Cv> cvs;
	public long getId_candidat() {
		return id_candidat;
	}
	public void setId_candidat(long id_candidat) {
		this.id_candidat = id_candidat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getLien_photo() {
		return lien_photo;
	}
	public void setLien_photo(String lien_photo) {
		this.lien_photo = lien_photo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getSituation_famille() {
		return situation_famille;
	}
	public void setSituation_famille(int situation_famille) {
		this.situation_famille = situation_famille;
	}
	public NiveauEtude getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(NiveauEtude niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	
	public Set<competanceRatingDto> getRatings() {
		return ratings;
	}
	public void setRatings(Set<competanceRatingDto> ratings) {
		this.ratings = ratings;
	}
	public Set<langueRatingDto> getLratings() {
		return Lratings;
	}
	public void setLratings(Set<langueRatingDto> lratings) {
		Lratings = lratings;
	}
	public Set<Loisir> getLoisirs() {
		return loisirs;
	}
	public void setLoisirs(Set<Loisir> loisirs) {
		this.loisirs = loisirs;
	}
	public Set<Formation> getFormations() {
		return formations;
	}
	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}
	public Set<Cv> getCvs() {
		return cvs;
	}
	public void setCvs(Set<Cv> cvs) {
		this.cvs = cvs;
	}
	public Set<entretienDto> getEntretiens() {
		return entretiens;
	}
	public void setEntretiens(Set<entretienDto> entretiens) {
		this.entretiens = entretiens;
	}
	
}
