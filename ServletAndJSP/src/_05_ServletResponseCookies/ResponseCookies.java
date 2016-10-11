package _05_ServletResponseCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie userNameCookie = new Cookie("userName", "alper");
		Cookie passwordCookie = new Cookie("password", "123456");
		
		userNameCookie.setMaxAge(20);//20 sn sonra silinecektir
		resp.addHeader("Set-Cookie","testName=testValue");

		resp.addCookie(userNameCookie);
		resp.addCookie(passwordCookie);

		PrintWriter pw = resp.getWriter();

		pw.print(userNameCookie.getValue());
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				System.out.println(c.getName() + " " + c.getValue());
			}
		}
	}
}
