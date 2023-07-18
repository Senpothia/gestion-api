package com.michel.gestionapi.model.auxiliary;

import java.util.List;



public class CompteAux {
	
	private Integer id;
	private String nom;
	private String reference;
	private float solde;
	private UtilisateurAux proprietaire;
	private List<OperationAux> operations;
	private List<RegleAux> regles;
	private List<InvitationAux> invitations;

}
