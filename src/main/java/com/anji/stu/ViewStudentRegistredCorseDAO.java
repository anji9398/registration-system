package com.anji.stu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class ViewStudentRegistredCorseDAO 
{
	ArrayList<StudentBean> al = new ArrayList<>();
   public ArrayList<StudentBean> studentRegistredCorse(HttpServletRequest req)
   {
	  try 
	  {
		   Connection con = DBConnection.getConnection();
		   PreparedStatement ps = con.prepareStatement("select * from studentcou where stuid=?");
		   ps.setString(1,req.getParameter("id"));
		   ResultSet rs = ps.executeQuery();
		   while(rs.next())
		   {
			  StudentBean sb = new StudentBean();
			  sb.setId(rs.getString(1));
			  sb.setName(rs.getString(2));
			  sb.setRegCourse(rs.getString(3));
			  al.add(sb);
		   }
		   
	  } catch (Exception e) {e.printStackTrace();}
	  return al;
   }
}
