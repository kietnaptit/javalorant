package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/bai1")
public class Bai1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		long n = Long.parseLong(req.getParameter("number"));
		long result = n * n;
		System.out.println("Binh phuong cua " + n + " la " + result);
		pw.println("Binh phuong cua " + n + " la " + result);
	}
}
