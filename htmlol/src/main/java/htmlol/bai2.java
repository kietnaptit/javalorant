package htmlol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bai2")
public class bai2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String s = req.getParameter("s");
        String rev = "";
        for(int i = 0; i < s.length(); i++){
            rev = s.charAt(i) + rev;
        }
        if(s.equals(rev)){
            pw.println(s + " la 1 palindrome");
        }else{
            pw.println(s + " khong phai la 1 palindrome");
        }		
	}
}
