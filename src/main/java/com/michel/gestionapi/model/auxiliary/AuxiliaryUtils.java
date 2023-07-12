package com.michel.gestionapi.model.auxiliary;

import java.util.ArrayList;
import java.util.List;

import com.michel.gestionapi.model.Utilisateur;

public class AuxiliaryUtils {
	
	public static List<UtilisateurAux> makeListUtilisateursAux(List<Utilisateur> utilisateurs) {

		List<UtilisateurAux> utilisateursAux = new ArrayList<>();
		for (Utilisateur u : utilisateurs) {

			UtilisateurAux uAux = new UtilisateurAux(u);
			utilisateursAux.add(uAux);

		}
		return utilisateursAux;
	}


}
