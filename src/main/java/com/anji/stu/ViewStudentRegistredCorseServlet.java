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
@WebServlet("/view")
public class ViewStudentRegistredCorseServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
    {
    	ArrayList<StudentBean> al = new ViewStudentRegistredCorseDAO().studentRegistredCorse(req);
    	if(al == null)
    	{
    		req.setAttribute("msg", "Cources are not Enrolled...");
    		RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
    		rd.forward(req, res);	
    	}else {
    		HttpSession hs = req.getSession( );
    		hs.setAttribute("al1", al);
    		RequestDispatcher rd = req.getRequestDispatcher("ViewStudentRegisterdCourse.jsp");
    		rd.forward(req, res);
    		
    	}
    }
}
