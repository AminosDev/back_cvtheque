package com;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hamcrest.core.CombinableMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.models.Candidat;
import com.models.Competence;
import com.models.CompetenceRating;
import com.models.CompetenceRatingId;
import com.models.Role;
import com.models.Utilisateur;
import com.repositories.CandidatRepository;
import com.repositories.CompetenceRatingRepository;
import com.repositories.CompetenceRepository;
import com.repositories.RoleRepository;
import com.repositories.UtilisateurRepository;


@SpringBootApplication
public class CvBackApplication  implements CommandLineRunner{

	@Autowired
	private CompetenceRepository cpr ;
	
	@Autowired
	private CandidatRepository cdp;
	
	@Autowired
	private CompetenceRatingRepository crp;
	
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Competence competence1 = new Competence("Java");
		Competence competence2 = new Competence("Angular");
		Competence competence3 = new Competence("Php");
		
		Candidat candidat1 = new Candidat("Nom","Prenom","A22",new Date(),"photo.jpg","mail@mail.com","adresse1","+2120676",2);
		Candidat candidat2 = new Candidat("Nom2","Prenom2","A33",new Date(),"photo2.jpg","mail2@mail.com","adresse2","+21206762",2);
		
		cpr.save(competence1);
		cpr.save(competence2);
		cpr.save(competence3);
		
		cdp.save(candidat1);
		cdp.save(candidat2);
		
		CompetenceRatingId cr1 = new CompetenceRatingId(candidat1,competence2);
		CompetenceRatingId cr2 = new CompetenceRatingId(candidat1,competence1);
		CompetenceRatingId cr3 = new CompetenceRatingId(candidat1,competence3);
		CompetenceRatingId cr4 = new CompetenceRatingId(candidat2,competence2);
		
		CompetenceRating crr1 = new CompetenceRating(cr1,4);
		CompetenceRating crr2 = new CompetenceRating(cr2,1);
		CompetenceRating crr3 = new CompetenceRating(cr3,2);
		CompetenceRating crr4 = new CompetenceRating(cr4,5);
		
		crp.save(crr1);
		crp.save(crr2);
		crp.save(crr3);
		crp.save(crr4);
		
	}
}
