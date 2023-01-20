package com.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		// considering this as a controller we need service DI
		
		
	}
}
