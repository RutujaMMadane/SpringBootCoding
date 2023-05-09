package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
@Autowired
EmployeeDao dao;
	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Employee addEmployee(Employee e) {
		Employee existingemp=dao.findById(e.getId()).orElse(null);
   if(existingemp==null)
    {
		e.setEname(e.getEname());
		e.setJob(e.getJob());
		e.setMgr(e.getMgr());
		e.setHiredate(e.getHiredate());
		e.setSal(e.getSal());
		e.setComm(e.getComm());
		e.setDept_id(e.getDept_id());
		e.setImage_path(e.getImage_path());
		return dao.save(e);
}
else
{
	throw new ResourceNotFoundException("employee already exist");
}

	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return this.dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
	}
	@Override
	public Employee updateEmployee(Employee e) {
		Employee existingEmp=dao.findById(e.getId()).orElseThrow(() -> new ResourceNotFoundException("employee not exist with id :"));
		
		
		existingEmp.setEname(e.getEname());
		existingEmp.setJob(e.getJob());
		existingEmp.setMgr(e.getMgr());
		existingEmp.setHiredate(e.getHiredate());
		existingEmp.setSal(e.getSal());
		existingEmp.setComm(e.getComm());
		existingEmp.setDept_id(e.getDept_id());
		existingEmp.setImage_path(e.getImage_path());
		
		return dao.save(existingEmp);
	}
	@Override
	public String deleteById(int id) {
		Employee existsID=dao.findById(id).orElse(null);
		if(existsID!=null)
		{
		dao.deleteById(id);
		return "Employee deleted!!";
		}
		else
		{
		throw new ResourceNotFoundException("employee id not available");

		}
	}

}
