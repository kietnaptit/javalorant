package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send-cookies")
public class CookiesSend extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("Xin chao lop Lap Trinh Web");
		Cookie cookie = new Cookie("name", "lap-trinh-web");
		cookie.setMaxAge(5);
		resp.addCookie(cookie);
		Cookie cookie2 = new Cookie("age", "30");
		cookie2.setMaxAge(10);
		resp.addCookie(cookie2);
	}
}
