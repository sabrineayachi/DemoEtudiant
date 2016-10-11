package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEtudiant
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
@WebServlet("/ServletEtudiant")
public class ServletEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nom = request.getParameter("nom");

		String moy = request.getParameter("moyenne");
		float moyenne = Float.parseFloat(moy);
		
		Etudiant et = new Etudiant();
	
		//out.println("nom : " + nom + " moyenne : " + moy);
	
		et.setMoyenne(moyenne) ;
		et.setNom(nom);
		
		//getServletContext().getRequestDispatcher("/sucess.jsp").forward(request, response);
		   
		boolean bool = et.succeed();
		if (bool == true)
			//out.println(" l'etudiant " + nom + " a r�ussi ");
			getServletContext().getRequestDispatcher("/sucess.jsp").forward(request, response); //envoyer le request
		   
		else //	out.println(" l'etudiant " + nom + " a r�doubl� ");
			getServletContext().getRequestDispatcher("/failure.jsp").forward(request, response);
		
			
		//out.println("")
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
