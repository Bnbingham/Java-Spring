package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.BearDAO;
import com.revature.util.ConnFactory;

public class BearDAOImp implements BearDAO{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createBear(String caveName, String bearName, String date, String bearType) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{ call BEARPRO(?,?,?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setString(1, caveName);
		call.setString(2, bearName);
		call.setString(3, date);
		call.setString(4, bearType);
		call.execute();
	}
	
}
