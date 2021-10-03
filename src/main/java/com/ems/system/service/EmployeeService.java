package com.ems.system.service;

import java.util.List;

import com.ems.system.model.Employee;

public interface EmployeeService {
	
	Employee savEmployee(Employee employee);
	
	List<Employee> getAllEmployees();

}
