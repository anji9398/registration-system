package com.anji.stu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteCourseServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cource = req.getParameter("course");
		String code = req.getParameter("code"); 
		int k = new DeleteeDAO().delete(cource, code);
		if (k > 0) 
		{
			req.setAttribute("msg", "Deleted succsessfully...");
			RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
			rd.forward(req, res);
			
		}
	}
}
