package com.kishan.aPracticeJdbc.repository;

import java.sql.SQLException;
import java.util.List;

import com.kishan.aPracticeJdbc.entities.User;

public interface Repository {
	public User selectOne(String value) throws SQLException;

	public List<User> selectall() throws SQLException;

	public int insert(String value) throws SQLException;

	public void update(String value);

	public void delete(String value);
}
