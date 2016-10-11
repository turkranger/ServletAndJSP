package _12_Expression;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _12_Expression.Model.Department;
import _12_Expression.Model.Employee;

public class ExpressionLanguage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("ISO-8859-9");
		Department department = new Department(100, "Software Department");
		Employee employee = new Employee(1, "Alper Bagli", department);
		req.setAttribute("myemployee", employee);

		RequestDispatcher view = req.getRequestDispatcher("_12_ExpressionLanguage/expressionLangBean.jsp");
		view.forward(req, resp);
	
		
	}
}
