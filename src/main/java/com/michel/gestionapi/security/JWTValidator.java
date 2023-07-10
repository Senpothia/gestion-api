package com.michel.gestionapi.security;


import org.springframework.stereotype.Component;

import com.michel.gestionapi.constants.Constants;
import com.michel.gestionapi.model.Utilisateur;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;



@Component
public class JWTValidator {
	
	public Utilisateur validate(String token) {
		
		Utilisateur jwtUser = null;
		try {
			
			Claims body = Jwts.parser()
					.setSigningKey(Constants.YOUR_SECRET)
					.parseClaimsJws(token)
					.getBody();
			
			jwtUser = new Utilisateur();
			jwtUser.setUsername(body.getSubject());
			jwtUser.setId(Integer.parseInt((String) body.get(Constants.USER_ID)));
		}catch (Exception e){
			
			
		}
		
		return jwtUser;
	}
	

}

