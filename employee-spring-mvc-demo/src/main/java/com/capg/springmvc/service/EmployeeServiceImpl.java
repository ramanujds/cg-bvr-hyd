package com.capg.springmvc.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springmvc.dao.EmployeeDaoImpl;
import com.capg.springmvc.model.Employee;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoImpl dao;

	
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
