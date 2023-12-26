package com.anji.stu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseListDAO 
{
	ArrayList<CourseBean> al = new ArrayList<>();
	
   public ArrayList<CourseBean> getCourseDetails() 
   {
	   
	   try 
	   {
		   Connection con = DBConnection.getConnection();
		   PreparedStatement retrive =  con.prepareStatement("select * from courseInfo");
		   ResultSet rs = retrive.executeQuery();
		   while(rs.next())
		   {
			   CourseBean cb = new CourseBean();
			  cb.setCouCode(rs.getString(1)); 
			  cb.setCouTitle(rs.getString(2));
			  cb.setCouDescription(rs.getString(3));
			  cb.setCapacity(Integer.parseInt(rs.getString(4)));
			  cb.setCouSchedule(rs.getString(5));
			  al.add(cb);
		   }
		   
	    } catch (Exception e) {e.printStackTrace();	}
	   
	   return al;
   }
   
   
}
