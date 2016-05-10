package servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.JPAUtil;
import managers.KompozicijaManager;
import model.Tim6kompozicija;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Tim6kompozicija> kompozicije = null;
		EntityManager em = JPAUtil.getEntityManager();
		String pretraga = request.getParameter("pretraga");
		String kriterijum = request.getParameter("kriterijum");
		switch (kriterijum) {
		case "Naziv":
			kompozicije = new KompozicijaManager().getKompozicijaNaziv(em, pretraga);
			break;
		case "Izvodjac":
			kompozicije = new KompozicijaManager().getKompozicijaIzvodjac(em, pretraga);
			break;
		case "Album":
			kompozicije = new KompozicijaManager().getKompozicijaAlbum(em, pretraga);
			break;
		case "Godina":
			kompozicije = new KompozicijaManager().getKompozicijaGodina(em, Integer.parseInt(pretraga));
			break;
		case "Zanr":
			kompozicije = new KompozicijaManager().getKompozicijaZanr(em, pretraga);
			break;
		}
		request.setAttribute("kompozicije", kompozicije);
		for (Tim6kompozicija k: kompozicije) {
			request.setAttribute("kompozicija", k);
		}
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/search.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
