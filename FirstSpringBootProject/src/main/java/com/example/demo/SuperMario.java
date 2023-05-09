package com.example.demo;

import org.springframework.stereotype.Component;

@Component("supermario")

public class SuperMario implements GameConsole{
	
	public void moveUp()
	{
		System.out.println("super mario can move up");
	}
	public void moveDown()
	{
		System.out.println("super mario can move down");
	}
	public void moveLeft()
	{
		System.out.println("super mario can move left");
	}
	public void moveRight()
	{
		System.out.println("super mario can move right");
	}

}
