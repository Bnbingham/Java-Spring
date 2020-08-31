package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.SuperheroDAO;
import com.revature.util.ConnFactory;

public class SuperheroDAOImp implements SuperheroDAO{
	public static ConnFactory cf= ConnFactory.getInstance();
	//calling a stored proceedure
	@Override
	public void createSuperheor(String heroName) throws SQLException {
		//sending a prepared statement
		Connection conn = cf.getConnection();
		String sql = "{ call INSERTSUPERHERO(?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setString(1, heroName);
		call.execute(); //what you use to execute a stored proceedure
		
	}

}
