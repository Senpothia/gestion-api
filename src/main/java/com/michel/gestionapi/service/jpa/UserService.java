package com.michel.gestionapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.michel.gestionapi.model.Utilisateur;
import com.michel.gestionapi.model.auxiliary.UtilisateurAux;
import com.michel.gestionapi.repository.UtilisateurRepository;
import com.michel.gestionapi.service.UtilisateurAbstractService;

@Service
public class UserService implements UtilisateurAbstractService {
	
	

	@Autowired
	UtilisateurRepository userRepo;

	@Autowired
	PasswordEncoder encoder;
	
	
	@Override
	public List<Utilisateur> listerUsers() {

		List<Utilisateur> users = userRepo.findAll();
		return users;
	}

	@Override
	public Utilisateur obtenirUserParId(Integer id) {

		Utilisateur user = userRepo.getReferenceById(id);
		return user;
	}

	

	@Override
	public Utilisateur obtenirUserParEmail(String email) {

		Utilisateur user = userRepo.findByEmail(email);
		return user;
	}
	
	

	@Override
	public void ajouterUser(Utilisateur user) {

		String password = encoder.encode(user.getPassword());
		user.setPassword(password);
		userRepo.save(user);

	}

	@Override
	public void modifierUser(Utilisateur user) {
		userRepo.save(user);

	}

	@Override
	public void supprimerUser(Utilisateur user) {
		userRepo.delete(user);

	}

	public Utilisateur obtenirUserParlogin(String email, String password) {
		
		Utilisateur utilisateur = userRepo.findByUsername(email);
		if (encoder.matches(password, utilisateur.getPassword())){
			
			return utilisateur;

		} else

			return null;

	}

	public void changerStatut(Integer id) {
		Utilisateur utilisateur = userRepo.getReferenceById(id);
		utilisateur.setEnabled(!utilisateur.isEnabled());
		userRepo.save(utilisateur);
				
	}

	public void enregistrer(Utilisateur ressource) {
		userRepo.save(ressource);
		
	}




	public void modifierDroitsRessource(UtilisateurAux ressource) {
		
		
		Utilisateur utilisateur = obtenirUserParId(ressource.getId());
		utilisateur.setRole(ressource.getRole());
		utilisateur.setAutorise(ressource.isAutorise());
		enregistrer(utilisateur);
	}


}
