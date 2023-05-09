package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("Mario")
public class Mario implements GameConsole
{
	public void moveUp()
	{
		System.out.println("I can move up");
	}
	public void moveDown()
	{
		System.out.println("I can move down");
	}
	public void moveLeft()
	{
		System.out.println("I can move left");
	}
	public void moveRight()
	{
		System.out.println("I can move right");
	}
	

}
