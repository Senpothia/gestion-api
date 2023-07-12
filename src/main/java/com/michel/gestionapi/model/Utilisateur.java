package com.michel.gestionapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	@Column(unique=true)
	private String username;
	private String password;
	private boolean enabled;
	private boolean autorise;
	private String role; 
	
	@OneToMany(mappedBy = "proprietaire")
	private List<Compte> comptes;
	
	@OneToMany(mappedBy = "invite")
	private List<Invitation> invitations;

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(Integer id, String nom, String prenom, String email, String username, String password,
			boolean enabled, boolean autorise, String role, List<Compte> comptes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.autorise = autorise;
		this.role = role;
		this.comptes = comptes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAutorise() {
		return autorise;
	}

	public void setAutorise(boolean autorise) {
		this.autorise = autorise;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	

}
