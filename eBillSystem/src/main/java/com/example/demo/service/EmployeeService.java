package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService 
{
	public List<Employee>findAllEmployee();
	public Employee addEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(Employee e);
	public String deleteById(int id);

}
