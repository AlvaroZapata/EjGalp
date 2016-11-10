package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidarPago
 */
@WebServlet("/Validar")
public class ValidarPago extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ValidarPago() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numero = request.getParameter("numero"); 
		String codigo = request.getParameter("codigo");
		
		if (numero != null) { //ESTOY EN TARJETA
		
			//CON DATOS
			request.setAttribute("dato1", "TARJETA");
			
			//SIN DATOS
			//response.sendRedirect(arg0);
		} else { //ESTOY EN EFECTIVO
			request.setAttribute("dato1", "EFECTIVO");
		}
		request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
