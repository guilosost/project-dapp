package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head><title>My first Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Servlet in first.</h1><p>");
        out.println("<strong>Context path: </strong>" + request.getContextPath() + "<br>");
        out.println("<strong>Local address: </strong>" + request.getLocalAddr() + "<br>");
        out.println("<strong>Local port: </strong>" + request.getLocalPort() + "<br>");
        out.println("<strong>Protocol: </strong>" + request.getProtocol() + "<br>");
        out.println("<strong>Request URL: </strong>" + request.getRequestURL() + "<br>");
        out.println("<strong>HTTP method: </strong>" + request.getMethod() + "<br>");
        out.println("<strong>Browser: </strong>" + request.getHeader("User-Agent") + "<br>");
        
        out.println("</p></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
