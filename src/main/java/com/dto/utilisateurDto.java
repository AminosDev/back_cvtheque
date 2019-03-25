package com.dto;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.Entretien;
import com.models.Role;

public class utilisateurDto {
	private long id_utilisateur; 
	private String nom;
	private String prenom;
	private String mail;
	private String lien_image;
	private Date last_login;
	private String matricule;
	private String mdp;
	private Role role ;
	@JsonIgnoreProperties({"utilisateur"})
    private Set<entretienDto> entretiens;
	public long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Set<entretienDto> getEntretiens() {
		return entretiens;
	}
	public void setEntretiens(Set<entretienDto> entretiens) {
		this.entretiens = entretiens;
	}
    
	
}
