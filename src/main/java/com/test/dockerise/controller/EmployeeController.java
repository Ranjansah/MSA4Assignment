package com.test.dockerise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dockerise.employee.Employee;
import com.test.dockerise.exception.UserNotFoundException;
import com.test.dockerise.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	

	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		Employee empl=employeeService.getEmployee(id);
		if(empl==null)
			throw new UserNotFoundException("Id not present");
		return empl;
	
	}

}
