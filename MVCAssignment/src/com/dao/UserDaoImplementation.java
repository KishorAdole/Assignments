package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.MyConnection;
import com.dto.User;

public class UserDaoImplementation implements UserDao {
	
	private MyConnection myConnection;
	
	public UserDaoImplementation() {
		myConnection = new MyConnection();
	}

	@Override
	public int insertUserDetails(User user) {
		int row = 0;
		try {
			Connection connection = myConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("insert into user(Full_Name, Username, Password) values(?,?,?)");
			statement.setString(1, user.getFullName());
			statement.setString(2, user.getUserName());
			statement.setString(3, user.getUserPassword());
			
			row=statement.executeUpdate();
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
		
	}

	@Override
	public boolean login(User user) {
		boolean flag=false;
		try {
			Connection connection = myConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from user where Username = ? and Password = ?   ");
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getUserPassword());
			
			ResultSet resultSet=statement.executeQuery();
			if(resultSet.next()) {
				user.setUserID(resultSet.getInt("userID"));
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
