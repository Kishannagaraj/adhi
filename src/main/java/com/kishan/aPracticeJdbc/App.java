package com.kishan.aPracticeJdbc;

import java.sql.SQLException;

import com.kishan.aPracticeJdbc.repository.UserRepository;
import com.kishan.aPracticeJdbc.service.UserService;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       UserService us = new UserService();
       
//       us.showProfile("amma@gmail.com");
    	
       us.showAllProfile();
  
    }
}
