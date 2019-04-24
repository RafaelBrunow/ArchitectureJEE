package com.infotel.metier;

public class Promo {
	
	private int idpromo;
	private String nomPromo;
	private int effectif;
	
	public int getIdpromo() {
		return idpromo;
	}
	public void setIdpromo(int idpromo) {
		this.idpromo = idpromo;
	}
	
	public String getNomPromo() {
		return nomPromo;
	}
	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}
	public int getEffectif() {
		return effectif;
	}
	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
	
	@Override
	public String toString() {
		return "Promo [idpromo=" + idpromo + ", nomPromo=" + nomPromo + ", effectif=" + effectif + "]";
	}
	
	
}
