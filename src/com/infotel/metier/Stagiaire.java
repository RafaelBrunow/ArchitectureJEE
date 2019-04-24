package com.infotel.metier;

public class Stagiaire {

	private int idstagiaire;
	private String nom;
	private String prenom;
	private int age;
	
	public int getIdstagiaire() {
		return idstagiaire;
	}
	public void setIdstagiaire(int idstagiaire) {
		this.idstagiaire = idstagiaire;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Stagiaire [idstagiaire=" + idstagiaire + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
