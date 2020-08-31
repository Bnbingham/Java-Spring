package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.beans.VideoGame;
import com.revature.util.ConnFactory;

public class VGDOAImpl {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public static VideoGame getVGByID(int id) throws SQLException{
		String sql = "SELECT * FROM VIDEOGAMES WHERE VGID="+id;
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		VideoGame vg = null;
		while(rs.next()) {
			vg = new VideoGame(rs.getInt(1), rs.getString(2), rs.getInt(3));
		}
		return vg;
	}
	
	public void insertVG(VideoGame vg) throws SQLException{
		String sql = "INSERT INTO VIDEOGAMES VALUES(?,?,?)";
		Connection conn = cf. getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, vg.getVgID());
		ps.setString(2, vg.getVgName());
		ps.setInt(3, vg.getVgMetaScore());
		ps.executeUpdate();
	}
}
