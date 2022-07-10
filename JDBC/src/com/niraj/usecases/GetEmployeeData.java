package com.niraj.usecases;

import java.util.List;

import com.niraj.bean.Employee;
import com.niraj.dao.EmployeeDao;
import com.niraj.dao.EmployeeDaoImpl;

public class GetEmployeeData {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
	
		try {
			List<Employee> list = dao.getAllData();
			list.forEach(e -> {
				System.out.println("------** Record **------");
				System.out.println("ID : "+e.getId());
				System.out.println("Name : "+e.getName());
				System.out.println("Address : "+e.getAddress());
				System.out.println("Salary : "+e.getSalary()+"\n");
			});
		} catch (Exception e2) {
			e2.printStackTrace();
		}	
	}
}
