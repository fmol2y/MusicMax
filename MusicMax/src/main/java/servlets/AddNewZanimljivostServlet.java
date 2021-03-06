package servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.JPAUtil;
import model.Tim6zanimljivost;

/**
 * Servlet implementation class AddNewZanimljivostServlet
 */
public class AddNewZanimljivostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewZanimljivostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			EntityManager em = JPAUtil.getEntityManager();
			Tim6zanimljivost zanimljivost = new Tim6zanimljivost();
			zanimljivost.setTekst(request.getParameter("tekst"));
			zanimljivost.setIdz(Integer.parseInt(request.getParameter("id")));
			em.persist(zanimljivost);
			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
