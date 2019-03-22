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
import com.repositories.LoisirRepository;
import com.repositories.RoleRepository;
import com.repositories.UtilisateurRepository;


@SpringBootApplication
public class CvBackApplication  implements CommandLineRunner{

//	@Autowired
//	private UtilisateurRepository Ur ;
//	
//	@Autowired
//	private RoleRepository ro;
	
	/*@Autowired
	
	@Autowired
	private LoisirRepository lr ;*/
	@Autowired
	private CandidatRepository cr;
	@Autowired
	private FormationRepository fr ;
	
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
    
	
		
		
	}
}
