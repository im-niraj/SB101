package com.niraj.usecases;

import java.util.Scanner;

import com.niraj.bean.Employee;
import com.niraj.dao.EmployeeDao;
import com.niraj.dao.EmployeeDaoImpl;
import com.niraj.exception.EmployeeException;


public class GetOneEmployeeDetail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id no");
		int id = scanner.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			Employee emp = dao.getEmployeeData(id);
			
			System.out.println("ID : "+emp.getId());
			System.out.println("Name : "+emp.getName());
			System.out.println("Address : "+emp.getAddress());
			System.out.println("Salary : "+emp.getSalary());
			
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}

}
