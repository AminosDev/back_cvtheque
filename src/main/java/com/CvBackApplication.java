package com;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.controllers.CandidatController;
import com.controllers.LangueController;
import com.controllers.LangueRatingController;
import com.models.Candidat;
import com.models.Langue;
import com.models.LangueRating;
import com.models.Role;
import com.models.Utilisateur;
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
	LangueRatingController Lrc;
	
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
	LangueRating lr=new LangueRating(l, c, 2);
	LangueRating lr2=new LangueRating(l2, c4,5 );
	
	Lrc.createLangueRating(lr);
	Lrc.createLangueRating(lr2);
	
	}
}
