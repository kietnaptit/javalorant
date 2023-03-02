package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormGet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printer = resp.getWriter();
		String ten = req.getParameter("name");
		String tuoi = req.getParameter("age");
		printer.println("<h1>Day la API su dung phuong thuc GET </h1>");
		printer.println("<h1> Ten cua ban la " + ten + "</h1>");
		printer.println("<h1> Tuoi cua ban la " + tuoi + "</h1>");
		printer.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printer = resp.getWriter();
		String ten = req.getParameter("name");
		String tuoi = req.getParameter("age");
		printer.println("<h1>Day la API su dung phuong thuc POST </h1>");
		printer.println("<h1> Ten cua ban la " + ten + "</h1>");
		printer.println("<h1> Tuoi cua ban la " + tuoi + "</h1>");
		printer.close();		
	}

}
