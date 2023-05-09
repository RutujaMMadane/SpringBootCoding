package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product>findAll();
	public void save(Product p);
	public Optional<Product> findById(int pid);
	public void update(Product p);
	public void delete(Product p);

}
