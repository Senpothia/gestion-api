package com.michel.gestionapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Operation;
import com.michel.gestionapi.model.auxiliary.AuxiliaryUtils;
import com.michel.gestionapi.model.auxiliary.CategorieAux;
import com.michel.gestionapi.model.auxiliary.CompteAux;
import com.michel.gestionapi.model.auxiliary.OperationAux;
import com.michel.gestionapi.service.jpa.CategorieService;
import com.michel.gestionapi.service.jpa.CompteService;
import com.michel.gestionapi.service.jpa.OperationService;




@RestController
public class OperationController {
	
	
	@Autowired
	OperationService operationService;
	
	@Autowired
	CategorieService categorieService;
	
	@Autowired
	CompteService compteService;
	
	
	@GetMapping("/compte/ajouter/operations/{id}")
	List<OperationAux> getOperationsByAccount(@RequestHeader("Authorization") String token, @PathVariable("id")Integer id){
		
		List<OperationAux> operations = operationService.getOperationByAccount(id);
		
		return operations;
		
	}
	
	@PostMapping("/operation/ajouter/{idCompte}")
	void ajouterOperation(@RequestHeader("Authorization") String token, @RequestBody OperationAux operation, @PathVariable("idCompte")Integer idCompte) {
		
		operationService.ajouterOperation(operation);
	}
	
	@GetMapping("/categories/get/all")
	List<String> getAllNomsCategories(@RequestHeader("Authorization") String token){
		
		List<Categorie> categories = categorieService.getAllCategories();
		List<String> cats = AuxiliaryUtils.makeListNomCategories(categories);
		return cats; 
	}
	
	@GetMapping("/operation/modifier/{id}")
	OperationAux getOperationsById(@RequestHeader("Authorization") String token, @PathVariable("id") Integer id) {
		
		Operation op = operationService.getOperationById(id);
		OperationAux operation = new OperationAux(op);
		Compte cpte = op.getCompte();
		CompteAux cAux = new CompteAux(cpte);
		operation.setCompte(cAux);
		return operation;
	}
	
	
	@PostMapping("/operation/modifier/{id}")
	void modifyOperation(@RequestHeader("Authorization") String token, @RequestBody OperationAux operation, @PathVariable("id") Integer id) {
		
		operationService.modifyOperation(operation);
		
	}

}
