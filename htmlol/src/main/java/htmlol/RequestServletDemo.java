package htmlol;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/req-resp")
public class RequestServletDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		System.out.println("Method cua request la: " + req.getMethod());
		pw.println("Method cua request la: " + req.getMethod());
		System.out.println("Context path cua request la: " + req.getContextPath());
		pw.println("Context path cua request la: " + req.getContextPath());
		pw.println("Tat ca cac header cua request la: ");
		Enumeration<String> headerNames = req.getHeaderNames();
		if(headerNames != null) {
			while(headerNames.hasMoreElements()) {
				pw.println("Header Request: " + req.getHeader(headerNames.nextElement()));
			}
		}
		resp.addHeader("Example Response Header 1", "Value1-HttpServletResponse");
		resp.addHeader("Example Response Header 2", "Value2-HttpServletResponse");
		Collection<String> headerNames2 = resp.getHeaderNames();
		for(String x : headerNames2) {
			pw.println("Header Respone: " + x +"<br>");
		}
		pw.println("Tat ca cac header cua respone la: ");
		resp.setStatus(404);
		pw.println("Respone tra ve loi 404: " + resp.getStatus());
		
	}
}
