package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.Product;

public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository dao;
	public List<Product> findAll()
	{
		return dao.findAll();
	}
	public void save(Product p)
	{
		dao.save(p);
	}
	public Optional<Product> findById(int pid)
	{
		return dao.findById(pid);
	}
	public void update(Product p)
	{
		dao.save(p);
	}
	public void delete(int pid)
	{
		dao.deleteById(pid);
	}
	@Override
	public String update(Product p)
	{
		Product existingProduct=dao.findById(p.getpId()).orElse(null);
		if(existingProduct==null)
		{
			return "Product does not exist";
		}
		else
		{
			existingProduct.setpName(p.getpName());
			existingProduct.setUnitprice(p.getUnitprice());
			existingProduct.setProductDes(p.getProductDes());
			dao.save(existingProduct);
			return "Product details updated!!";
		}
	}
	
	@Override
	public String delete(int pid)
	{
		Product existingProduct=dao.findById(pid)).orElse(null);
		if(existingProduct!==null)
		{
			dao.deleteById(pid);
			return "Product deleted!!";
		}
		else
		{
			throw new ResourceNotFoundException("No such product exist!!")
			
		}
	} 


}
