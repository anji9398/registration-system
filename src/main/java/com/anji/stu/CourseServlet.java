package com.anji.stu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/dis")
public class CourseServlet extends HttpServlet
{
	@Override
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   ArrayList<CourseBean> al = new CourseListDAO().getCourseDetails();
	   HttpSession hs = req.getSession();
	   hs.setAttribute("al", al);
	   
	   if(al == null)
	   {
		   req.setAttribute("msg", "Empty");
		   RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
		   rd.forward(req, res);
		   
	   }else {
		   	
			   RequestDispatcher rd = req.getRequestDispatcher("ViewCourseList.jsp");
			   rd.forward(req, res);
	   }
   }
	   
}
