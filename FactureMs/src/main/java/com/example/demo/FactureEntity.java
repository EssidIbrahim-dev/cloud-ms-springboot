package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FactureEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	int id;
	String nom;
	String prenom;
	String Date;
	float somme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public float getSomme() {
		return somme;
	}
	public void setSomme(float somme) {
		this.somme = somme;
	}
	public FactureEntity(int id, String nom, String prenom, String date, float somme) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		Date = date;
		this.somme = somme;
	}
	@Override
	public String toString() {
		return "FactureEntity [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Date=" + Date + ", somme=" + somme
				+ "]";
	}
	public FactureEntity(String nom, String prenom, String date, float somme) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Date = date;
		this.somme = somme;
	}


	

}
