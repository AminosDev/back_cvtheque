package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.models.Role;
import com.models.Utilisateur;
import com.repositories.RoleRepository;
import com.repositories.UtilisateurRepository;


@SpringBootApplication
public class CvBackApplication  implements CommandLineRunner{

	@Autowired
	private UtilisateurRepository Ur ;
	
	@Autowired
	private RoleRepository ro;
	public static void main(String[] args) {
		SpringApplication.run(CvBackApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
    
		Role r = new Role("admin","desc");
		Role r1 = new Role("RT","desc");
		
		ro.save(r);
		ro.save(r1);
		Utilisateur u = new Utilisateur("nouali","mohamed",r);
		Utilisateur u1 = new Utilisateur("amine","mohamed",r);
		Utilisateur u2 = new Utilisateur("alae","bozit",r1);
		Ur.save(u);
		Ur.save(u1);
		Ur.save(u2);
		
	
		
		
	}
}