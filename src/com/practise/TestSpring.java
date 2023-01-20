package com.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
		DBOperation dbOperation=(DBOperation)ctx.getBean("b1");
		dbOperation.store();
		dbOperation.delete();
		ClassPathXmlApplicationContext cpax=(ClassPathXmlApplicationContext)ctx;
		cpax.close();
		
	}
}
