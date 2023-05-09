package com.example.demo.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController 
{
	@Autowired
	EmployeeService empservice;
	@GetMapping("/list")
	public List<Employee>findAll()
	{
		return empservice.findAll();
	}
	@GetMapping("/list/{empId}")
	public Employee findById(@PathVariable int  empId) {
		
		Employee e= empservice.findById(empId);
		if(e==null)
		{
			throw new RuntimeException("empid"+"detail not found"+empId);
		}
		else
		{
			return e;

		}
		
}
	@PostMapping("/save")
	public Employee save(@RequestBody Employee e)
	{  
		//e.setId(0);
		empservice.save(e);
		return e;
	}
	@DeleteMapping("/delete/{empId}")
	public String delete(@PathVariable int empId)
	{
		Employee e=findById(empId);
		if(e==null)
		{
			throw new RuntimeException("delete data not found");
		}
		else
		{
			empservice.deleteById(empId);
			return "employee id"+empId;
		}
		
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee e)
	{
		
		empservice.update(e);
		return e;
	}
	
}
