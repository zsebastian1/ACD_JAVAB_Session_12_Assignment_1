package books;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnlineBooks2
 */

@WebServlet("/OnlineBooks2")
public class OnlineBooks2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnlineBooks2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		//String stmt;

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {

		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String book_title = request.getParameter("book_title");
		String book_author = request.getParameter("book_author");
		String book_publisher = request.getParameter("book_publisher");
		String book_year_published = request.getParameter("book_year_published");
		String book_price = request.getParameter("book_price");

		String q = "insert into `onlinebooks`.books(book_title, book_author, book_publisher, book_year_published, book_price) values(?,?,?,?,?)";
		java.sql.Connection con = DBConnection.getDBInstance();
		
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(q);
			//stmt.executeUpdate();
			stmt.setString(1, book_title);
			stmt.setString(2, book_author);
			stmt.setString(3, book_publisher);
			stmt.setString(4, book_year_published);
			stmt.setString(5, book_price);
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// update
		/*
		String u_book_id = request.getParameter("u_book_id");
		String u_book_title = request.getParameter("u_book_title");
		String u_book_author = request.getParameter("u_book_author");
		String u_book_publisher = request.getParameter("u_book_publisher");
		String u_book_year_published = request.getParameter("u_book_year_published");
		String u_book_price = request.getParameter("u_book_price");
		
		String q2 = "UPDATE `onlinebooks`.`books` SET book_title = ?, book_author = ?, book_publisher = ?, book_year_published = ?, book_price = ? WHERE(book_id = ?) ";
		java.sql.Connection con2 = DBConnection.getDBInstance();
		
		PreparedStatement stmt2;
		try {
			stmt2 = con.prepareStatement(q2);
			//stmt.executeUpdate();
			stmt2.setString(1, u_book_title);
			stmt2.setString(2, u_book_author);
			stmt2.setString(3, u_book_publisher);
			stmt2.setString(4, u_book_year_published);
			stmt2.setString(5, u_book_price);
			stmt2.setString(6,  u_book_id);
			stmt2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String r_book_id = request.getParameter("r_book_id");
		String r_book_title = request.getParameter("r_book_title");
		String r_book_author = request.getParameter("r_book_author");
		String r_book_publisher = request.getParameter("r_book_publisher");
		String r_book_year_published = request.getParameter("r_book_year_published");
		String r_book_price = request.getParameter("r_book_price");
		
		String q3 = "DELETE FROM `onlinebooks`.`books` WHERE book_title = ?";
		java.sql.Connection con3 = DBConnection.getDBInstance();
		
		PreparedStatement stmt3;
		try {
			stmt3 = con.prepareStatement(q3);
			//stmt.executeUpdate();
			stmt3.setString(1, r_book_title);
		
			stmt3.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		doGet(request, response);
		*/
		
	}

}
