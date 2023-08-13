package com.michel.gestionapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Utilisateur;
import com.michel.gestionapi.model.auxiliary.AuxiliaryUtils;
import com.michel.gestionapi.model.auxiliary.CompteAux;
import com.michel.gestionapi.repository.CompteRepository;
import com.michel.gestionapi.service.CompteAbstractService;

@Service
public class CompteService implements CompteAbstractService {

	@Autowired
	CompteRepository compteRepo;

	@Autowired
	UserService userService;

	public void ajouterCompte(CompteAux compte) {

		Compte c = new Compte();
		c.setNom(compte.getNom());
		Utilisateur proprietaire = userService.obtenirUserParId(compte.getProprietaire());
		c.setProprietaire(proprietaire);
		c.setReference(compte.getReference());
		c.setSolde(compte.getSolde());
		compteRepo.save(c);

	}

	public List<CompteAux> getComptes(Integer userId) {

		Utilisateur u = userService.obtenirUserParId(userId);
		List<Compte> comptes = compteRepo.findByProprietaire(u);
		List<CompteAux> cAux = AuxiliaryUtils.makeListComptesAux(comptes);
		return cAux;
	}

	public CompteAux getCompte(Integer idCompte) {

		Compte compte = compteRepo.getReferenceById(idCompte);
		CompteAux c = new CompteAux(compte);
		return c;
	}
	
	
	public Compte getSingleAccount(Integer idCompte) {

		Compte compte = compteRepo.getReferenceById(idCompte);
		return compte;
	}

}
