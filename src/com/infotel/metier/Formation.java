package com.infotel.metier;

public class Formation {
	
	private int idformation;
	private String nomFormation;
	
	public int getIdformation() {
		return idformation;
	}
	public void setIdformation(int idformation) {
		this.idformation = idformation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	
	@Override
	public String toString() {
		return "Formation [idformation=" + idformation + ", nomFormation=" + nomFormation + "]";
	}
	
	
}
