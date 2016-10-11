package _07_ServletListener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContextAttributeApp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Check Eclipse Console!");
		
		ServletContext context = getServletContext();

		context.setAttribute("context attribute", "my context attribute");

		context.setAttribute("context attribute", "my new context attribute");

		context.removeAttribute("context attribute");
		
		PrintWriter pw = resp.getWriter();
		HttpSession session = req.getSession();

		if (session.isNew()) {
			pw.print("new session");
		} else {
			pw.print("old session");
		}

	}
}
