package com.capg.springmvc.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl {

	private static Map<Integer,Employee> employeeData=
			new HashMap<Integer,Employee>();
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
