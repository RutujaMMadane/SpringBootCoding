package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product>findAll();
	public void save(Product p);
	public Optional<Product> findById(int pid);
	public String update(Product p);
	public String delete(int pid)
	

}
