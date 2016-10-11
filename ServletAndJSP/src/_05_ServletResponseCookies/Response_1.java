package _05_ServletResponseCookies;

import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Response_1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("ISO-8859-9");
		
		resp.setHeader("firstName", "myname");
		resp.setHeader("firstName", "myname-Override!");

		boolean contains = resp.containsHeader("firstName");
		System.out.println("contains:" + contains);

		String firstName = resp.getHeader("firstName");
		System.out.println("firstName:" + firstName);

		resp.addHeader("firstName", "your name");
		resp.addHeader("firstName", "his name");

		System.out.println("### more value getHeader test###");
		firstName = resp.getHeader("firstName");
		System.out.println("firstName:" + firstName);

		System.out.println("#### getHeaders test ####");
		Collection<String> firstNamesHeader = resp.getHeaders("firstName");
		for (String firstNameHeader : firstNamesHeader) {
			System.out.println("firstName:" + firstNameHeader);
		}
		
		resp.setIntHeader("year", 571);
		resp.addIntHeader("year", 1071);

		resp.setDateHeader("today", System.currentTimeMillis());
		resp.addDateHeader("today", 10000000L);

		System.out.println("#### getHeaderNames ####");

		Collection<String> headerNames = resp.getHeaderNames();
		for (String headerName : headerNames) {
			System.out.println(headerName);

		}
	}
}
