package _05_ServletResponseCookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDirect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("ISO-8859-9");
		
		System.out.println("Bu kisim calisacak!");
		
		resp.sendRedirect("/ServletAndJSP/direct.html");
		
		System.out.println("Bu kisim calismayacaktir!");
	}
}
