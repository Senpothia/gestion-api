package com.michel.gestionapi.model;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Regle {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Compte compte;
	
	@ManyToOne
	private Categorie categorie;
	
	@Column(precision=8, scale=2) 
	  private float valeur;
  // valeur du montant de dépense limite
	
	private Integer interval;  // Durée d'application de la règle en nombre de mois
	
	private LocalDateTime init;  // date de mise en application de la règle
	
	private LocalDateTime fin;   // date de fin d'application de la règle
	
	private Boolean active;
	
	private Boolean notified;

	public Regle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Regle(Integer id, Compte compte, Categorie categorie, float valeur, Integer interval, LocalDateTime init,
			LocalDateTime fin, Boolean active, Boolean notified) {
		super();
		this.id = id;
		this.compte = compte;
		this.categorie = categorie;
		this.valeur = valeur;
		this.interval = interval;
		this.init = init;
		this.fin = fin;
		this.active = active;
		this.notified = notified;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public LocalDateTime getInit() {
		return init;
	}

	public void setInit(LocalDateTime init) {
		this.init = init;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getNotified() {
		return notified;
	}

	public void setNotified(Boolean notified) {
		this.notified = notified;
	}

	
	
	
	

}
