package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/product")

public class ProductController {
	
	@Autowired
	ProductService service;
	@GetMapping("/list")
	public List<Product>findAll()
	{
		List<Product>prolist=service.findAll();
		return prolist;
	}
	@PostMapping("/save")
	public void save(@RequestBody Product p)
	
	{
		service.save(p);
	}
	@GetMapping("")
	
	@PutMapping("/update")
	public void update(@RequestBody Product p)
	{
		service.update(p);
		new ResponseEntity<String>("Product not available",HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/delete/{pid}")
	public void deleteById(@PathVariable int pid)
	{
		service.delete(pid);
	}
	
	
	

}
