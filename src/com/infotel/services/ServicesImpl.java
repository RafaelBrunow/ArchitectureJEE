package com.infotel.services;

import java.util.List;

import com.infotel.dao.Idao;
import com.infotel.dao.daoImpl;
import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class ServicesImpl implements Iservices {

	private Idao dao = new daoImpl();

	@Override
	public int ajouterStagiaire(Stagiaire s) {
		return dao.ajouterStagiaire(s);
	}

	@Override
	public int supprimerStagiaire(Stagiaire s) {
		return dao.supprimerStagiaire(s);
	}

	@Override
	public List<Stagiaire> findAllStagiaires() {
		return dao.findAllStagiaires();
	}

	@Override
	public int ajouterPromo(Promo p) {
		return dao.ajouterPromo(p);
	}

	@Override
	public int supprimerPromo(Promo p) {
		return dao.supprimerPromo(p);
	}

	@Override
	public List<Promo> findAllPromos() {
		return dao.findAllPromos();
	}

	@Override
	public int ajouterFormation(Formation f) {
		return dao.ajouterFormation(f);
	}

	@Override
	public int supprimerFormation(Formation f) {
		return dao.supprimerFormation(f);
	}

	@Override
	public List<Formation> findAllFormations() {
		return dao.findAllFormations();
	}

	@Override
	public void attribuerPromoFormation(Promo p, Formation f) {
		dao.attribuerPromoFormation(p, f);	
	}

	@Override
	public void attribuerStagiairePromo(Stagiaire s, Promo p) {
		dao.attribuerStagiairePromo(s, p);	
	}

}
	