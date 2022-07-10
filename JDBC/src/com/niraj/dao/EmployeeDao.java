package com.niraj.dao;

import java.util.List;

import com.niraj.bean.Employee;
import com.niraj.exception.EmployeeException;

public interface EmployeeDao {

	// insert Employee details to EmployeeRecord Database
	public String insertEmployeeDetils(Employee employee);
	
	// get all data of employee table
	public List<Employee> getAllData() throws EmployeeException;
	
	//get employee record with id
	public Employee getEmployeeData(int id) throws EmployeeException;
}
