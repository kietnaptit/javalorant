package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bai3")
public class bai3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String in1 = req.getParameter("ho");
		String in2 = req.getParameter("ten");
		String out = "Cac ha ho " + in1.substring(0,1).toUpperCase() + in1.substring(1).toLowerCase() + " ten " + in2.substring(0,1).toUpperCase() + in2.substring(1).toLowerCase();
		pw.println(out);
	}
}
