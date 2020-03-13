package com.capg.service;

import com.capg.model.Employee;

import java.util.List;

import com.capg.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl {

	private EmployeeDaoImpl dao;
	
	public EmployeeServiceImpl() {
		dao=new EmployeeDaoImpl();
	}
	
	public int addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}
	public Employee findEmployee(int empId) {
		return dao.findEmployee(empId);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
}
