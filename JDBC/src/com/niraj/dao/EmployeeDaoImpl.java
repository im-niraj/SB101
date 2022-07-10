package com.niraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.niraj.bean.Employee;
import com.niraj.utility.DBUtility;

public class EmployeeDaoImpl implements EmployeeDao {
	final Connection conn = DBUtility.provideConnection();
	
//	+---------+-------------+------+-----+---------+----------------+
//	| Field   | Type        | Null | Key | Default | Extra          |
//	+---------+-------------+------+-----+---------+----------------+
//	| id      | int         | NO   | PRI | NULL    | auto_increment |
//	| name    | varchar(12) | YES  |     | NULL    |                |
//	| address | varchar(12) | YES  |     | NULL    |                |
//	| salary  | int         | YES  |     | NULL    |                |
//	+---------+-------------+------+-----+---------+----------------+

	@Override
	public String insertEmployeeDetils(Employee employee) {
		String message = "Not inserted...";
		try (conn){
			
			// for auto incremented at second parameter use Statement.RETURN_GENERATED_KEYS
			PreparedStatement ps = conn.prepareStatement("INSERT INTO employee(name,address,salary) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddress());
			ps.setInt(3, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = x+" Record Inserted";
			}	
		} catch (SQLException e) {
			message = e.getMessage();
		}
		return message;
	}

}