package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao
{
	public List<Employee>findAll();
	public Employee findById(int id);
	public void save(Employee e);
	public void update(Employee e);
	public void deleteById(int id);

}
