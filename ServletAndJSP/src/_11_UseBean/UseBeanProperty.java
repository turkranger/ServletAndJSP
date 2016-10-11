package _11_UseBean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _11_UseBean.Model.Person;

public class UseBeanProperty extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person1 = new Person("alper", "bagli", 1990);
		req.setAttribute("myperson", person1);

		RequestDispatcher view = req.getRequestDispatcher("_11_UseBean/useBeanProperty.jsp");
		view.forward(req, resp);

	}
}
