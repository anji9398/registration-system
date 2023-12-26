package com.anji.stu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/dis1")
public class RegisterServlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        int k =	new RegisterDAO().regStudent(req);
        if(k>0)
        {
        	req.setAttribute("msg","Registered Successfully...");
        	RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
        	rd.forward(req, res);
        }else {
        	req.setAttribute("msg"," Not Registered...");
        	RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
        	rd.forward(req, res);
        }
    }
}
