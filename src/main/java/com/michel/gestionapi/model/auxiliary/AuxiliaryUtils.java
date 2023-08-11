package com.michel.gestionapi.model.auxiliary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Invitation;
import com.michel.gestionapi.model.Operation;
import com.michel.gestionapi.model.Regle;
import com.michel.gestionapi.model.Utilisateur;
import com.michel.gestionapi.service.jpa.CategorieService;

public class AuxiliaryUtils {
	

	public static List<UtilisateurAux> makeListUtilisateursAux(List<Utilisateur> utilisateurs) {

		List<UtilisateurAux> utilisateursAux = new ArrayList<>();
		for (Utilisateur u : utilisateurs) {

			UtilisateurAux uAux = new UtilisateurAux(u);
			utilisateursAux.add(uAux);

		}
		return utilisateursAux;
	}

	public static List<OperationAux> makeListOperationsAux(List<Operation> operations) {

		List<OperationAux> opsAux = new ArrayList<>();
		for (Operation o : operations) {

			OperationAux oAux = new OperationAux(o);
			opsAux.add(oAux);
		}
		return opsAux;
	}

	public static List<RegleAux> makeListReglesAux(List<Regle> regles) {

		List<RegleAux> reglesAux = new ArrayList<>();
		for (Regle r : regles) {

			RegleAux rAux = new RegleAux(r);
			reglesAux.add(rAux);
		}
		return reglesAux;
	}

	public static List<InvitationAux> makeListInvitationAux(List<Invitation> invitations) {

		List<InvitationAux> invAux = new ArrayList<>();
		for (Invitation i : invitations) {

			InvitationAux iAux = new InvitationAux(i);
			invAux.add(iAux);
		}
		return invAux;
	}

	public static List<CompteAux> makeListComptesAux(List<Compte> comptes) {

		List<CompteAux> csAux = new ArrayList<>();
		for (Compte c : comptes) {

			CompteAux cAux = new CompteAux(c);
			csAux.add(cAux);

		}
		return csAux;
	}

	
}
