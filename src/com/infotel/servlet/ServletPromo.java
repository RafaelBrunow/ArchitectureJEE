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
 * Servlet implementation class ServletPromo
 */
@WebServlet("/ServletPromo")
public class ServletPromo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Iservices service = new ServicesImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPromo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomPromo = null;
		int effectif = 0;
		
		if(request.getParameter("nomPromo")!=null){  
			effectif = Integer.parseInt(request.getParameter("effectif"));            
			nomPromo = request.getParameter("nomPromo"); 
		}
		
		
		Promo p = new Promo();
		p.setNomPromo(nomPromo);
		p.setEffectif(effectif);
		
		service.ajouterPromo(p);
		
		request.setAttribute("promo", service.findAllPromos());		
					
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
