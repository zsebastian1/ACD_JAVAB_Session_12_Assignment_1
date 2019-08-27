package books;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnlineBooks3
 */
@WebServlet("/OnlineBooks3")
public class OnlineBooks3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnlineBooks3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u_book_id = request.getParameter("u_book_id");
		String u_book_title = request.getParameter("u_book_title");
		String u_book_author = request.getParameter("u_book_author");
		String u_book_publisher = request.getParameter("u_book_publisher");
		String u_book_year_published = request.getParameter("u_book_year_published");
		String u_book_price = request.getParameter("u_book_price");
		
		String q2 = "UPDATE `onlinebooks`.`books` SET book_title = ?, book_author = ?, book_publisher = ?, book_year_published = ?, book_price = ? WHERE(book_id = ?) ";
		java.sql.Connection con = DBConnection.getDBInstance();
		
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
		
		doGet(request, response);
	}

}
