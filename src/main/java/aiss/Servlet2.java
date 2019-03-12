package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<!doctype html>");
//        out.println("<html>");
//        out.println("<head><title>Servlet 2</title></head>");
//        out.println("<body>");
//        out.println("<h1>Respuesta al formulario.</h1><p>");
//        out.println("<strong>Nombre: </strong>" +  request.getParameter("name") + "<br>");
//        out.println("<strong>Telefono: </strong>" +  request.getParameter("phone") + "<br>");
//        
//        out.println("</p></body></html>");
		
		request.getRequestDispatcher("/ejercicio4.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
