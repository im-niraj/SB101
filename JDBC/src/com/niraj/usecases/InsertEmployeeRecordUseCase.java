package com.niraj.usecases;

import java.util.Scanner;

import com.niraj.bean.Employee;
import com.niraj.dao.EmployeeDao;
import com.niraj.dao.EmployeeDaoImpl;

public class InsertEmployeeRecordUseCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------** Insert Employee Record **------");
		System.out.println("Name");
		String name = scanner.next();
		
		System.out.println("Address");
		String address = scanner.next();
		
		System.out.println("Salary");
		int salary = scanner.nextInt();
		scanner.close();
		
		Employee employee = new Employee();
		// set data to employee object without id because id is auto incremented
		employee.setName(name);
		employee.setAddress(address);
		employee.setSalary(salary);
		
		// create object of daoImplementation class and assing employee details
		EmployeeDao dao = new EmployeeDaoImpl();
		String message = dao.insertEmployeeDetils(employee);
		
		System.out.println(message);
		
		

	}

}
