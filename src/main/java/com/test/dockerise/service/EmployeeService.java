package com.test.dockerise.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.dockerise.employee.Employee;





@Service
public class EmployeeService {
	
	private List<Employee> emp = new ArrayList<>(Arrays.asList(
			new Employee("1","Ranjan Sah","26000"),
			new Employee("2","Abhishek Sahani","27000"),
			new Employee("3","Krishna Chaudhary","28000"),
			new Employee("5","Nikhil Sikaria","29000"),
			new Employee("6","Aditya Karna","30000"),
			new Employee("7","Aunrag Sah","31000"),
			new Employee("8","Rajan Jaiswal","32000"),
			new Employee("9","Roshan Yadav","33000"),
			new Employee("10","Ritesh Yadav","34000")
			));
	public List<Employee> getAllEmployees()
	{
		return emp;
	}
	
	public Employee getEmployee(String id)
	{
		try
		{
		return emp.stream().filter(t->t.getId().equals(id)).findFirst().get();
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

}
