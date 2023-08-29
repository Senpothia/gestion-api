package com.michel.gestionapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.michel.gestionapi.model.auxiliary.CompteAux;
import com.michel.gestionapi.service.jpa.CompteService;

@RestController
public class CompteController {

	@Autowired
	CompteService compteService;

	@PostMapping("/compte/save")
	void creerCompteBancaire(@RequestHeader("Authorization") String token, @RequestBody CompteAux compte) {

		compteService.ajouterCompte(compte);

	}
	
	@PostMapping("/compte/modifier")
	void modifierCompteBancaire(@RequestHeader("Authorization") String token, @RequestBody CompteAux compte) {

		compteService.modifierCompte(compte);

	}

	@GetMapping("/get/comptes/{userId}")
	List<CompteAux> getComptes(@RequestHeader("Authorization") String token, @PathVariable("userId") Integer userId) {
		
		List<CompteAux> comptes = compteService.getComptes(userId);
		return comptes;
	}
	
	
	
	@GetMapping("/get/compte/{idCompte}")
	CompteAux getCompte(@RequestHeader("Authorization") String token, @PathVariable("idCompte") Integer idCompte) {
		
		
		CompteAux compte = compteService.getCompte(idCompte);
		return compte;
	}
	


}
