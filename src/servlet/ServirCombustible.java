package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServirCombustible
 */
@WebServlet("/ServirCombustible")
public class ServirCombustible extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServirCombustible() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String Gasolina98 = request.getParameter("Gasolina98"); 
		String GasolinaSinPlomo = request.getParameter("GasolinaSinPlomo");
		String GasoleoA = request.getParameter("GasoleoA"); 
		String Diesel = request.getParameter("Diesel");
		
		if (Gasolina98 != null) { //Pulsa el boton de Gasolina98
		
			//CON DATOS
			request.setAttribute("dato2", "GASOLINA98");
			
			//SIN DATOS
			//response.sendRedirect(arg0);
		} else if (GasolinaSinPlomo != null) { //Pulsa el boton de GasolinaSinPlomo
			request.setAttribute("dato2", "GASOLINASINPLOMO");
		} else if (GasoleoA != null) { //Pulsa el boton de GasoleoA
			request.setAttribute("dato2", "GASOLEOA");
		} else { //Pulsa el boton de Diesel
			request.setAttribute("dato2", "DIESEL");
		}
		
		request.getRequestDispatcher("html/gracias.jsp").forward(request, response);
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
