package htmlol;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/book-search")
public class MySQLDemo2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printer = resp.getWriter();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","NguyenAnhKiet@@123");
			statement = connection.createStatement();
			String search = req.getParameter("search");
			resultSet = statement.executeQuery("SELECT * FROM book WHERE title LIKE '%" + search + "%'");
			while(resultSet.next()) {
				int bookcode = resultSet.getInt("bookcode");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String category = resultSet.getString("category");
				int approved = resultSet.getInt("approved");
				printer.println("<br>" + bookcode + ", " + title + ", " + author + ", " + category + ", " + approved);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
