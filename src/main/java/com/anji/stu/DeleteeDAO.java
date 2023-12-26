package com.anji.stu;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class DeleteeDAO 
{
   public int delete(String course,String code)  
   {
	   int k=0;
	   try 
	   {
		   Connection con = DBConnection.getConnection();
		  PreparedStatement ps =con.prepareStatement("delete from studentcou where stuid=? and regcourse=?");
	      ps.setString(1,code);
	      ps.setString(2, course);
	      k= ps.executeUpdate();
	   } catch (Exception e) {e.printStackTrace();}
	   return k;
   }
   
}
