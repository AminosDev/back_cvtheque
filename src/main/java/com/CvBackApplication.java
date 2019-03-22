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


@SpringBootApplication
public class CvBackApplication  implements CommandLineRunner{

//	@Autowired
//	private UtilisateurRepository Ur ;
//	
//	@Autowired
//	private RoleRepository ro;
	@Autowired
	CvRepository Cr;
	@Autowired
	NiveauEtudeRepository Ner;
	@Autowired
	private CompetenceRepository cpr ;
	
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
	private CandidatService cs;
	
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		
		
	
	
	}
}
