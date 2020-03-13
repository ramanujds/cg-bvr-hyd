package com.capg.dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.capg.model.Employee;
public class EmployeeDaoImpl {

	private static Map<Integer,Employee> employeeData=
			new HashMap<>();
	public int addEmployee(Employee emp) {
		employeeData.put(emp.getEmpId(), emp);
		return emp.getEmpId();
	}
	
	
	public Employee findEmployee(int empId) {
		return employeeData.get(empId);
	}


	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		for(int empId:employeeData.keySet()) {
			empList.add(employeeData.get(empId));
		}
		return empList;
	}

	
	
}
