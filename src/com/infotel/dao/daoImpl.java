package com.infotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;


public class daoImpl implements Idao {
	
	private Connection connect;
	private PreparedStatement st ;
	private ResultSet rs;

	@Override
	public int ajouterStagiaire(Stagiaire s) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("INSERT INTO Stagiaire(nom,prenom,age)"
					+ " VALUES(?,?,?)");
			st.setString(1, s.getNom());
			st.setString(2, s.getPrenom());
			st.setInt(3, s.getAge());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return s.getIdstagiaire();
	}

	@Override
	public int supprimerStagiaire(Stagiaire s) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("DELETE FROM Stagiaire "
					+ "WHERE (idstagiaire = ?)") ;
			st.setInt(1, s.getIdstagiaire());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return 0;
	}

	@Override
	public List<Stagiaire> findAllStagiaires() {
		List<Stagiaire> list = new ArrayList<Stagiaire>();
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("SELECT * FROM Stagiaire");
			
			rs = st.executeQuery();
			
			//3 - Récupérer le résultat en cas de besoin
			
			while(rs.next()) {
				Stagiaire s = new Stagiaire();
				s.setIdstagiaire(rs.getInt("idstagiaire"));
				s.setNom(rs.getString("nom"));
				s.setPrenom(rs.getString("prenom"));
				s.setAge(rs.getInt("age"));
				
				list.add(s);
			}
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return list;
	}

	@Override
	public int ajouterPromo(Promo p) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("INSERT INTO Promo(nomPromo,effectif)"
					+ " VALUES(?,?)");
			st.setString(1, p.getNomPromo());
			st.setInt(2, p.getEffectif());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return p.getIdpromo();
	}

	@Override
	public int supprimerPromo(Promo p) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("DELETE FROM Promo "
					+ "WHERE (idpromo = ?)") ;
			st.setInt(1, p.getIdpromo());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return 0;
	}

	@Override
	public List<Promo> findAllPromos() {
		List<Promo> list = new ArrayList<Promo>();
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("SELECT * FROM Promo");
			
			rs = st.executeQuery();
			
			//3 - Récupérer le résultat en cas de besoin
			
			while(rs.next()) {
				Promo p = new Promo();
				p.setIdpromo(rs.getInt("idpromo"));
				p.setNomPromo(rs.getString("nomPromo"));
				p.setEffectif(rs.getInt("effectif"));
				
				list.add(p);
			}
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return list;
	}

	@Override
	public int ajouterFormation(Formation f) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("INSERT INTO Formation(nomFormation)"
					+ " VALUES(?)");
			st.setString(1, f.getNomFormation());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return f.getIdformation();
	}

	@Override
	public int supprimerFormation(Formation f) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("DELETE FROM Formation "
					+ "WHERE (idformation = ?)") ;
			st.setInt(1, f.getIdformation());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return 0;
	}

	@Override
	public List<Formation> findAllFormations() {
		List<Formation> list = new ArrayList<Formation>();
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("SELECT * FROM Formation");
			
			rs = st.executeQuery();
			
			//3 - Récupérer le résultat en cas de besoin
			
			while(rs.next()) {
				Formation f = new Formation();
				f.setIdformation(rs.getInt("idformation"));
				f.setNomFormation(rs.getString("nomFormation"));
				
				list.add(f);
			}
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		return list;
	}

	@Override
	public void attribuerPromoFormation(Promo p, Formation f) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("UPDATE Promo SET fformation=? WHERE idpromo=?");
			
			st.setInt(1, f.getIdformation());
			st.setInt(2, p.getIdpromo());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		
	}
	

	@Override
	public void attribuerStagiairePromo(Stagiaire s, Promo p) {
		try {
			//1 - Se connecter à la base de données
			connect = GestionConnexion.getInstance();
			
			//2 - Effectuer la requête
			st = connect.prepareStatement("UPDATE Stagiaire SET fpromo=? WHERE idstagiaire=?");
			
			st.setInt(1, p.getIdpromo());
			st.setInt(2, s.getIdstagiaire());
			
			st.executeUpdate();
			
			//3 - Récupérer le résultat en cas de besoin
			
		} catch (Exception e) {
			System.out.println("Ca ne marche pas");

		}
		
	}

}

	