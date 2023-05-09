package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameConsole console; //interface
	@Autowired
	public GameRunner(@Qualifier("super mario")GameConsole console)
	{
		this.console=console;
	}
	public void runGame()
	{
		console.moveLeft();
		console.moveDown();
		console.moveRight();
		console.moveUp();
	}
	

}
