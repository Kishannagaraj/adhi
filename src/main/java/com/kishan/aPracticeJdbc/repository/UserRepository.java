package com.kishan.aPracticeJdbc.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kishan.aPracticeJdbc.entities.User;
import com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues;

public class UserRepository extends RepoUtils implements Repository
{
	String selectOneQuery = "select * from AppUsers.Users where email = ? ";
	String selectAllQuery = "select * from AppUsers.Users";
	String insertQuery ="insert into AppUsers.Users values (?,?,?,?)";
	
	{
		try 
		{
			openConnection();
		}
		catch (SQLException e) 
		{		
			e.printStackTrace();
		}
	}
	public User selectOne(String value) throws SQLException
	{
		PreparedStatement pm = con.prepareStatement(selectOneQuery);
		User u1= null ;
		ResultSet rs = null;
		
		pm.setString(1, value);  //placeholder (?)
		 rs = pm.executeQuery();
		 
		 
	
		if(rs.next()== true);
		{
		int    uid   = rs.getInt("UID");
		String name  = rs.getString("Name");
		String email = rs.getString("Email");
		String mob   = rs.getString("mob");
		
		u1= new User(uid, name,email, mob);
		}
	//	System.out.println(uid +" ,"+name+" ,"+email+" ,"+mob);
		closeConnection();
		
		return u1;
	}

	public List<User> selectall() throws SQLException 
	{
		PreparedStatement pm= con.prepareStatement(selectAllQuery);
		ResultSet rs = pm.executeQuery();
		
		
		List<User> userList = new ArrayList<User>();
		
		while(rs.next()==true)
		{
			int uid = rs.getInt("UID");
			String name = rs.getString("Name");
			String email = rs.getString("Email");
			String mob = rs.getString("mob");
			
			User u1 = new User(uid, name,email, mob);
			
			userList.add(u1);
			// System.out.println(uid +" ,"+name+" ,"+email+" ,"+mob);
		}
		closeConnection();
		return userList;
	}


	public int insert(String value) throws SQLException 
	{
		PreparedStatement ps = con.prepareStatement("insertQuery");
		
		ps.setInt(1, 0);
		ps.setString(2, value);
		ps.setString(3, value);
		ps.setString(4, value);
		
		int count = ps.executeUpdate();
		closeConnection();
		return count;
	}

	public void update(String value) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String value) {
		// TODO Auto-generated method stub
		
	}

	

}
