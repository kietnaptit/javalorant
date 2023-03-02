package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(urlPatterns ="/kiet")
public class Demo extends HttpServlet{
	@Override
	public void init() throws ServletException{
		System.out.println("bat dau Servlet");
	}
	@Override
	public void destroy() {
		System.out.println("ket thuc Servlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		super.service(req, resp);
		System.out.println("bat dau 1 service (api)");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Hello Kiet</h1>");
		writer.close();
	}
	
}