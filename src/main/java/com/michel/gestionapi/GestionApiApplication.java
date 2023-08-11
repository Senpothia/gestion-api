package com.michel.gestionapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.auxiliary.AuxiliaryUtils;
import com.michel.gestionapi.service.jpa.CategorieService;



@SpringBootApplication
public class GestionApiApplication {
	

	public static void main(String[] args) {
	
		
		SpringApplication.run(GestionApiApplication.class, args);
		
		
	}
	
	
	
	
	
	

}
