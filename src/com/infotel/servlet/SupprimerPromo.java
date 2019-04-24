package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Promo;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class SupprimerPromo
 */
@WebServlet("/SupprimerPromo")
public class SupprimerPromo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Iservices service = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerPromo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1 - Récupération des données
		
		int idpromo = Integer.parseInt(request.getParameter("idpromo"));
		
//2 - Envoyer à la couche service
		
		Promo p = new Promo();
		p.setIdpromo(idpromo);
		service.supprimerPromo(p);
		
//3 - Préparation à l'envoi
		
		request.setAttribute("promo", service.findAllPromos());
		
//4 - Envoi à la JSP
		
		request.getRequestDispatcher("promo.jsp").forward(request, response);
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
