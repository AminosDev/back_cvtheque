package com;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.models.Candidat;
import com.models.Cv;
import com.models.Loisir;
import com.models.NiveauEtude;
import com.models.Role;
import com.models.Utilisateur;
import com.repositories.CandidatRepository;
import com.repositories.FormationRepository;
import com.repositories.LangueRatingRepository;
import com.repositories.LangueRepository;
import com.repositories.LoisirRepository;
import com.repositories.NiveauEtudeRepository;
import com.controllers.CandidatController;
import com.controllers.LangueController;
import com.controllers.LangueRatingController;
import com.models.Candidat;
import com.models.Langue;
import com.models.LangueRating;
import com.models.LangueRatingId;
import com.models.Candidat;
import com.models.Competence;
import com.models.CompetenceRating;
import com.models.CompetenceRatingId;
import com.models.Cv;
import com.models.Role;
import com.models.Utilisateur;
import com.repositories.CandidatRepository;
import com.repositories.CompetenceRatingRepository;
import com.repositories.CompetenceRepository;
import com.repositories.CvRepository;
import com.repositories.RoleRepository;
import com.repositories.UtilisateurRepository;
import com.service.CandidatService;
import com.service.UtilisateurService;


@SpringBootApplication
public class CvBackApplication  implements CommandLineRunner{

//	@Autowired
//	private UtilisateurRepository Ur ;
//	
//	@Autowired
	private RoleRepository ro;
	@Autowired
	CvRepository Cr;
	@Autowired
	NiveauEtudeRepository Ner;
	@Autowired
	private CompetenceRepository cpr ;
	
	@Autowired
	private UtilisateurService us ;
	
	@Autowired
	private CandidatRepository cdp;
	
	@Autowired
	private CompetenceRatingRepository crp;
	
	/*@Autowired
	
	@Autowired
	private LoisirRepository lr ;*/
	/*@Autowired
	private CandidatRepository cr;
	@Autowired
	private FormationRepository fr ;
	
	@Autowired
	private LangueRepository lr;*/
	
	@Autowired 
	private RoleRepository cs;
	@Autowired
	private NiveauEtudeRepository nv ;
	
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		/*Candidat c=new Candidat("bouzit", "alae", "aa34557", new Date(), "asdasd", "sadfasd", "asdasd", "asdasd",1);
		NiveauEtude n = new NiveauEtude("ff");
		nv.save(n);
		c.setNiveauEtude(n);
		cs.saveCandidat(c);*/
		Role r = new Role("admin","add");
		cs.save(r);
	
	Utilisateur u = new Utilisateur( "d", "jdjl"," nd", "nsn", new Date(), "jsj", "eheg",r);
	us.saveUtilisateur(u);
		
	/*	Date d=new Date(1993, 10,23);
	
	Candidat c2=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	Candidat c3=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	Candidat c4=new Candidat("bouzit", "alae", "aa34557", d, "asdasd", "sadfasd", "asdasd", "asdasd",1);
	
	
	cr.save(c2);
	cr.save(c3);
	cr.save(c4);
	
	
	System.out.println(c);
	
	
	Cv h=new Cv("asjdhasjkdh", d);
	h.setCondidat(c2);
	Cr.save(h);
	*/
	}
}
