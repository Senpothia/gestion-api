package com.michel.gestionapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michel.gestionapi.constants.Constants;
import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Operation;
import com.michel.gestionapi.model.auxiliary.AuxiliaryUtils;
import com.michel.gestionapi.model.auxiliary.OperationAux;
import com.michel.gestionapi.repository.CompteRepository;
import com.michel.gestionapi.repository.OperationRepository;
import com.michel.gestionapi.service.OperationAbstractService;

@Service
public class OperationService implements OperationAbstractService {

	@Autowired
	OperationRepository operationRepo;
	
	@Autowired
	CompteService compteService;
	
	@Autowired
	CategorieService categorieService;
	
	
	public List<OperationAux> getOperationByAccount(Integer id) {
		
		Compte compte = compteService.getSingleAccount(id);
		List<Operation> ops = operationRepo.findByCompte(compte);
		List<OperationAux> operations = AuxiliaryUtils.makeListOperationsAux(ops);
		return operations;
	}


	public void ajouterOperation(OperationAux operation) {
		
		Operation o = new Operation();
		Compte compte = compteService.getSingleAccount(operation.getIdCompte());
		o.setCompte(compte);
		String nomCategorie = operation.getNomCategorie();
		Categorie cat = categorieService.getByNom(nomCategorie);
		o.setCategorie(cat);
		o.setDate(Constants.formatStringToDate(operation.getStringDate()));
		o.setMontant(operation.getMontant());
		operationRepo.save(o);
		
	}
	
	

}
