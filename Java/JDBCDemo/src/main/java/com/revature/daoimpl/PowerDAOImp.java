package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.dao.PowerDAO;
import com.revature.util.ConnFactory;

public class PowerDAOImp implements PowerDAO {
	//prepared statement - pre compiled - compiled in java, rather than SQL
	public static ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createPowers(String powerName) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO POWERS VALUES(POWSEQ.NEXTVAL,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, powerName);
		ps.executeUpdate();
		
	}

}
