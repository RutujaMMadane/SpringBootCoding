package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
@Autowired
 EntityManager entitymanager;
	@Override
	public List<Employee> findAll() {
		Session session=entitymanager.unwrap(Session.class);
		Query<Employee>query=session.createQuery("select e from Employee e",Employee.class);
		List<Employee>emplist=query.getResultList();
		return emplist;
	}
	@Override
	public Employee findById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		return session.get(Employee.class, id);
	}
	@Override
	@Transactional
	public void save(Employee e) {
		Session session=entitymanager.unwrap(Session.class);
		session.save(e);
		
	}
	@Override
	@Transactional
	public void update(Employee e) {
		Session session=entitymanager.unwrap(Session.class);
		session.merge(e);
		
	}
	@Override
	@Transactional
	public void deleteById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Query<Employee>query=session.createQuery("delete from Employee where id=:employeeid");
		query.setParameter("employeeid", id);
		query.executeUpdate();
	}
	

}
