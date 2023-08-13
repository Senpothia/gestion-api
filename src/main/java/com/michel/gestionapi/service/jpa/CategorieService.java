package com.michel.gestionapi.service.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.auxiliary.CategorieAux;
import com.michel.gestionapi.repository.CategorieRepository;
import com.michel.gestionapi.service.CategorieAbstractService;

@Service
public class CategorieService implements CategorieAbstractService, CommandLineRunner {

	@Autowired
	CategorieRepository categorieRepo;

	public void buildCategories() {

		List<Categorie> cats = getAllCategories();
		if (cats.isEmpty()) {

			List<Categorie> categories = new ArrayList<>();
			Categorie alimentation = new Categorie("Alimentation");
			categories.add(alimentation);
			Categorie transport = new Categorie("Transport");
			categories.add(transport);
			Categorie loisir = new Categorie("Loisir");
			categories.add(loisir);
			Categorie foyer = new Categorie("Foyer");
			categories.add(foyer);
			Categorie entretien = new Categorie("Entretien");
			categories.add(entretien);
			Categorie voiture = new Categorie("Voiture");
			categories.add(voiture);
			Categorie formation = new Categorie("Formation");
			categories.add(formation);
			Categorie culture = new Categorie("Culture");
			categories.add(culture);
			Categorie telephonie = new Categorie("Téléphonie");
			categories.add(telephonie);
			Categorie impots = new Categorie("Impôt");
			categories.add(impots);
			Categorie assurance = new Categorie("Assurance");
			categories.add(assurance);
			Categorie abonnement = new Categorie("Abonnement");
			categories.add(abonnement);
			Categorie pension = new Categorie("Pension");
			categories.add(pension);
			Categorie famille = new Categorie("Famille");
			categories.add(famille);
			Categorie jardin = new Categorie("Jardin");
			categories.add(jardin);
			Categorie professionnel = new Categorie("Professionnel");
			categories.add(professionnel);
			Categorie credit = new Categorie("Crédit");
			categories.add(credit);
			Categorie outils = new Categorie("Outils");
			categories.add(outils);
			Categorie divers = new Categorie("Divers");
			categories.add(divers);

			for (Categorie c : categories) {

				categorieRepo.save(c);
			}

		}

	}

	@Override
	public Categorie getCategorie(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> getAllCategories() {

		List<Categorie> categories = categorieRepo.findAll();
		return categories;
	}

	@Override
	public List<Categorie> getAllCategoriesByCompte(Compte compte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCategorie(CategorieAux categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategorie(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyCategorie(CategorieAux categorie) {
		// TODO Auto-generated method stub

	}

	public void createCategorie(Categorie categorie) {

		categorieRepo.save(categorie);

	}

	@Override
	public void run(String... args) throws Exception {

		buildCategories();
	}

	public Categorie getByNom(String nomCategorie) {
		Categorie categorie = categorieRepo.findByNom(nomCategorie);
		return categorie;
	}

}
