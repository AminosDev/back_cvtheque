package com;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	System.out.println(c);
	Langue l=new Langue("Francais");
	Langue l2=new Langue("Anglais");
	Langue l3=new Langue("Arabe");
	Langue l4=new Langue("Allemend");
	LangueRatingId lri=new LangueRatingId(l, c);
	LangueRatingId lri2=new LangueRatingId(l2, c2);
	LangueRating lr=new LangueRating( lri,4);
	LangueRating lr2=new LangueRating(lri2,5 );
	
	
		
	Lrc.save(lr);
	Lrc.save(lr2);
		
	}
}
