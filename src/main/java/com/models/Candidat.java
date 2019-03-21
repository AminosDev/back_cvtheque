package com.models;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Candidat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_condidat; 
	private String nom;
	private String prenom;
	private String cin;
	private Date date_naissance;
	private String lien_photo;
	private String mail;
	private String adresse;
	private String telephone;
	private int situation_famille;
	@ManyToMany
	private Collection< Formation> formations ;
	@ManyToMany
	private Collection< Langue> langues ;
	@ManyToMany
	private Collection< Loisir> loisirs ;
	@ManyToMany
	private Collection< Cv> cvs ;
	@ManyToOne
	private  NiveauEtude niveauEtude ;
	
	@OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<Entretien> entretiens;
	
	@OneToMany(mappedBy = "candidat")
    Set<CompetenceRating> ratings;
	
	public Set<Entretien> getEntretiens() {
		return entretiens;
	}

	public void setEntretiens(Set<Entretien> entretiens) {
		this.entretiens = entretiens;
	}

	public long getId_condidat() {
		return id_condidat;
	}
	
	public void setId_condidat(long id_condidat) {
		this.id_condidat = id_condidat;
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
	
	public Candidat(String nom, String prenom, String cin, Date date_naissance, String lien_photo, String mail,
			String adresse, String telephone, int situation_famille) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.date_naissance = date_naissance;
		this.lien_photo = lien_photo;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.situation_famille = situation_famille;
	}
	
	public Candidat() {
		super();
	}
	
	@Override
	public String toString() {
		return "Condidat [id_condidat=" + id_condidat + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin
				+ ", date_naissance=" + date_naissance + ", lien_photo=" + lien_photo + ", mail=" + mail + ", adresse="
				+ adresse + ", telephone=" + telephone + ", situation_famille=" + situation_famille + "]";
	}
	
	
	
	
	

}
