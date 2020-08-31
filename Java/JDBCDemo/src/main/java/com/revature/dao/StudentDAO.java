package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Car;

public interface StudentDAO {
	/*
	 * DAO design pattern
	 * Data Access Object
	 * Modularity and loose coupling
	 * beanDAO(interface) and beanDAOImp(concrete class)
	 * want to make sure that the only thing interacting with the db is the DAOImpl
	 * DAO is an open interface w/ multiple implementations
	 *
	 * DAO methods usually deal with CRUD ops!
	 */
	
	//create
	public void insertStudent(int id,String name, int sch_id) throws SQLException;
	
	//read all
	public List<Car> getStudentList() throws SQLException;
	
}
