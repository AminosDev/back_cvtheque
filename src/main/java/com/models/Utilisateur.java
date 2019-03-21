package com.models;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_utilisateur; 
	private String nom;
	private String prenom;
	private String mail;
	private String lien_image;
	private Date last_login;
	private String matricule;
	private String mdp;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role ;
	
	public Utilisateur() {
		super();
	}
	
	public Long getId() {
		return this.id_utilisateur;
	}
	
	public void setId(Long id_utilisateur) {
		this.id_utilisateur=id_utilisateur;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Utilisateur(String nom, String prenom, String mail, String lien_image, Date last_login, String matricule,String mdp, Role role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.lien_image = lien_image;
		this.last_login = last_login;
		this.matricule = matricule;
		this.mdp = mdp;
		this.role = role;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLien_image() {
		return lien_image;
	}

	public void setLien_image(String lien_image) {
		this.lien_image = lien_image;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	
	
	
	
	
	
	
	
}
