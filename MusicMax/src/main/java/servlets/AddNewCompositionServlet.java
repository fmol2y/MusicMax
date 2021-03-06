package servlets;

//import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.JPAUtil;
import javax.persistence.EntityManager;

import model.Tim6kompozicija;

/**
 * Servlet implementation class AddNewServlet
 */
public class AddNewCompositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final String fileLocation = "D:'\'git'\'MusicMax'\'MusicMax'\'src'\'main'\'resources'\'data";
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewCompositionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			EntityManager em = JPAUtil.getEntityManager();
			Tim6kompozicija kompozicija = new Tim6kompozicija();
			kompozicija.setNaziv(request.getParameter("title"));
			kompozicija.setAutor(request.getParameter("author"));
			kompozicija.setIzvodjac(request.getParameter("performer"));
			kompozicija.setAlbum(request.getParameter("album"));
			kompozicija.setGodina(Integer.parseInt(request.getParameter("year")));
			kompozicija.setPravac(request.getParameter("genre"));
			//Za sada se id korisnika unosi rucno, dok se sesija ne implementira.
			kompozicija.setId(Integer.parseInt(request.getParameter("id")));
			em.persist(kompozicija);
			//TODO implementirati upload fajla do kraja
			//File file = new File(request.getParameter("file"));
			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/newcomposition.jsp");
			rd.forward(request, response);
	}

}
