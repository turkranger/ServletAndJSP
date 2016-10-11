package _04_ServletRequest_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestForm extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("ISO-8859-9");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String sex = req.getParameter("sex");
		String medenidurum = req.getParameter("medeni durum");
		String[] language = req.getParameterValues("lang");

		PrintWriter pw = resp.getWriter();

		pw.print("");
		pw.println(sex + " " + firstName + "  " + lastName + "");
		pw.println(medenidurum );
		if (language != null) {
			for (String str : language) {
				pw.print(str);
			}
		}
		pw.print("");

		Enumeration paramNames = req.getParameterNames();
		while (paramNames.hasMoreElements()) {
			Object paramName = paramNames.nextElement();
			System.out.println(paramName.toString());
		}

		Map<String, String[]> parameterMap = req.getParameterMap();

		for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey() + " " + Arrays.asList(entry.getValue()));
		}
	}
}
