package _08_HttpSessionveUrlRewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class URLRewrite extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		req.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("ISO-8859-9");

		HttpSession session = req.getSession();
		session.setAttribute("name", "alper");
                //setAttribute metodu encodeURL metodundan once kullanilmalidir.

		PrintWriter out = resp.getWriter();
		String nonEncodedUrl = "getsession";
		String encodedUrl = resp.encodeURL("getsession");
		// encodedUrl kullanýlmalý tarayýcýlarýn cookie özelliði kapalý olabilir

		out.println("<html>");
		out.println("<head>");
		out.println("<title>URL Rewriter</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Giris - <a href=\"" + nonEncodedUrl + "\"> Click Here-Cookie kapalýysa çalýþmaz.</a><br>");
		out.println("Giris - <a href=\"" + encodedUrl + "\"> Click Here</a>.");
		out.println("</body>");
		out.println("</html>");
	}
}
