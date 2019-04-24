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
 * Servlet implementation class ServletStagiaire
 */
@WebServlet("/ServletStagiaire")
public class ServletStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Iservices service = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom = null;
		String prenom = null;
		int age = 0;
		
		if(request.getParameter("nom")!=null){  
			age = Integer.parseInt(request.getParameter("age"));            
			nom = request.getParameter("nom");            
			prenom = request.getParameter("prenom");
		}
		
		Stagiaire s = new Stagiaire();
		s.setAge(age);
		s.setNom(nom);
		s.setPrenom(prenom);
		
			
		if(request.getParameter("ajouter")!=null) {
			service.ajouterStagiaire(s);
		}
		
		request.setAttribute("stagiaire", service.findAllStagiaires());		
					
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
