package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Stagiaire;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class SupprimerStagiaire
 */
@WebServlet("/SupprimerStagiaire")
public class SupprimerStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Iservices service = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1 - Récupération des données
		
		int idstagiaire = Integer.parseInt(request.getParameter("idstagiaire"));
		
//2 - Envoyer à la couche service
		
		Stagiaire s = new Stagiaire();
		s.setIdstagiaire(idstagiaire);
		service.supprimerStagiaire(s);
		
//3 - Préparation à l'envoi
		
		request.setAttribute("stagiaire", service.findAllStagiaires());
		
//4 - Envoi à la JSP
		
		request.getRequestDispatcher("stagiaire.jsp").forward(request, response);
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
