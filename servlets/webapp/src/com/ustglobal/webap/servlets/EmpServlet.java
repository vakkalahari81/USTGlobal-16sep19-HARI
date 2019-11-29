package com.ustglobal.webap.servlets;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

		String str = req.getParameter("search");
		int num = Integer.parseInt(str);

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ust_ty_db?", "root", "root");
			//String sql = "select * from  employee_info where id = ?";

			pstm = con.prepareStatement("select * from  employee_info where id = ?");
			rs = pstm.executeQuery();
			pstm.setInt(1, num);


			if (rs.next()) {

				PrintWriter out = res.getWriter();

				out.println("Id = " + rs.getInt("ID"));
				out.println("Name = " + rs.getString("name"));
				out.println("Salary = " + rs.getInt("salary"));
				out.println("gender = " + rs.getString("gender"));
				out.println("---------------------------------");
			}else
			{
				System.out.println("No Data Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstm != null) {
					con.close();
				}
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
	}
}
