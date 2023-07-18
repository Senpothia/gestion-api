package com.michel.gestionapi.model.auxiliary;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Utilisateur;

public class InvitationAux {
	
	
	private Integer id;
	private CompteAux compte;
	private UtilisateurAux invite;
	private String droit;

}
