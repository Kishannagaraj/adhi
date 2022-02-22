package com.kishan.aPracticeJdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.kishan.aPracticeJdbc.entities.User;
import com.kishan.aPracticeJdbc.repository.UserRepository;

public class UserService 
{
	UserRepository userRepo = new UserRepository();
	
	public void showProfile(String email) throws SQLException
	{
		
		User u1 = userRepo.selectOne(email);
		
		
		System.out.println(u1.getUid() +" "+u1.getName()+" "+u1.getEmail()+ " "+u1.getMob());
	}
	
	public void showAllProfile() throws SQLException
	{
		List<User> userList = userRepo.selectall();
		
		for(int i=0 ; i<userList.size();i++)
		{
			User u1 = userList.get(i);
			
			System.out.println(u1.getUid());
			System.out.println(u1.getName());
			System.out.println(u1.getEmail());
			System.out.println(u1.getMob());
			
		}
	}
	
	public void signup() 
	{
		
	}
	
	public void login()
	{
		
	}
	
	public void update() 
	{
		
	}
	
	public void delete()
	{
		
	}
}
