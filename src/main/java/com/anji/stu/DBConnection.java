package com.anji.stu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{ 
	public static Connection con;
	public DBConnection() {}
	static 
	{
		try
		{
		  Class.forName(DBInfo.URL);
		  con = DriverManager.getConnection(DBInfo.DRIVER,DBInfo.USERNAME,DBInfo.PASSWORD);
	
		} catch (Exception e) {e.printStackTrace();}
		
	}
	public static Connection getConnection()
	{
		return con;
	}

}
