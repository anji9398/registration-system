package com.anji.stu;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

public class RegisterDAO 
{
   public int regStudent(HttpServletRequest req)
   {
	   int k=0;
	   try 
	   {
		  Connection con = DBConnection.getConnection();
		  PreparedStatement insert = con.prepareStatement("insert into studentcou values(?,?,?)");
		  insert.setString(1, req.getParameter("id"));
		  insert.setString(2, req.getParameter("name"));
		  insert.setString(3, req.getParameter("course"));
		   k = insert.executeUpdate();
		  
	   } catch (Exception e) {e.printStackTrace();}
	   return k;
   }
}
