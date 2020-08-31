package com.revature.dao;

import java.sql.SQLException;

public interface BearDAO {
	public void createBear(String caveName, String bearName, String date, String bearType) throws SQLException;
}
