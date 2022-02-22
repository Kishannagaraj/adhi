package com.kishan.aPracticeJdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepoUtils 
{
	String dburl = "jdbc:mysql://localhost:3306/appusers";
	String dbuser ="root";
	String pwd ="Kishan@123";
	Connection con = null;
	
	public void openConnection() throws SQLException
	{
		if(con==null)
		{
			con = DriverManager.getConnection(dburl, dbuser,pwd);
		}
		
	}
	public void closeConnection() throws SQLException
	{
		con.close();
	}
}
