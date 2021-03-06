import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/q8")
public class q8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck1 = new Cookie("1", "a");
		Cookie ck2 = new Cookie("2", "b");
		Cookie ck3 = new Cookie("4", "d");
		Cookie ck4 = new Cookie("8", "h");
		Cookie ck5 = new Cookie("16", "p");
		Cookie ck6 = new Cookie("32", "?");
		
		ck4.setMaxAge(3600);
		ck5.setMaxAge(3600);
		ck6.setMaxAge(3600);
		
		Cookie[] cookies = {ck1, ck2, ck3, ck4, ck5, ck6};
		for (Cookie cookie : cookies)
			res.addCookie(cookie);
		
		PrintWriter out = res.getWriter();
		out.println("<html>"
					+ "<body>"
					+ "<h2>Cookies have been set successfully as follows: </h2>"
					+ "<table border=1>"
					+ "<tr>"
					+ "<th>Key</th>"
					+ "<th>Value</th>"
					+ "<th>Expiry Time (in seconds)</th>"
					+ "</tr>");
		
		for (Cookie cookie : cookies) {
			out.println(""
					+ "<tr>"
					+ "<td> " + cookie.getName() + " </td>"
					+ "<td> " + cookie.getValue() + " </td>"
					+ "<td> " + cookie.getMaxAge() + " </td>"
					+ "</tr>");
		}
		out.println("</table></body></html>");
	}
}