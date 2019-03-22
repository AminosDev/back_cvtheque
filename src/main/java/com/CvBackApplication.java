package com;


import java.util.ArrayList;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.models.Candidat;
import com.models.Formation;
import com.models.Loisir;
import com.models.Role;
import com.models.Utilisateur;
import com.repositories.CandidatRepository;
import com.repositories.FormationRepository;
import com.repositories.LangueRepository;
import com.repositories.LoisirRepository;
import com.controllers.CandidatController;
import com.controllers.LangueController;
import com.controllers.LangueRatingController;
import com.controllers.LangueRatingRepository;
import com.models.Candidat;
import com.models.Langue;
import com.models.LangueRating;
import com.models.LangueRatingId;
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

//	@Autowired
//	private UtilisateurRepository Ur ;
//	
//	@Autowired
//	private RoleRepository ro;
	@Autowired
	LangueRatingRepository Lrc;
	@Autowired
	private CompetenceRepository cpr ;
	
	@Autowired
	private CandidatRepository cdp;
	
	@Autowired
	private CompetenceRatingRepository crp;
	
	/*@Autowired
	
	@Autowired
	private LoisirRepository lr ;*/
	@Autowired
	private CandidatRepository cr;
	@Autowired
	private FormationRepository fr ;
	
	@Autowired
	private LangueRepository lr;
	
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
		Date d=new Date(1993, 10,23);
	Candidat c=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	Candidat c2=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	Candidat c3=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	Candidat c4=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	
	cr.save(c);
	cr.save(c2);
	cr.save(c3);
	cr.save(c4);
	
	
	System.out.println(c);
	
	Langue l=new Langue("Francais");
	Langue l2=new Langue("Anglais");
	Langue l3=new Langue("Arabe");
	Langue l4=new Langue("Allemend");
	
	lr.save(l);
	lr.save(l2);
	lr.save(l3);
	lr.save(l4);
	
	LangueRatingId lri=new LangueRatingId(l, c);
	LangueRatingId lri2=new LangueRatingId(l2, c2);
	LangueRating lr=new LangueRating( lri,4);
	LangueRating lr2=new LangueRating(lri2,5 );
	
	
    
	
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
		
	Lrc.save(lr);
	Lrc.save(lr2);
		
	}
}
