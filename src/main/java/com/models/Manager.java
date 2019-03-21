package com.models;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Manager extends Utilisateur{

	public Manager() {
		super();
	}

	public Manager(String nom, String prenom, String mail, String lien_image, Date last_login, String matricule,
			String mdp, Role role) {
		super(nom, prenom, mail, lien_image, last_login, matricule, mdp, role);
	}

}
