package com.morningstar.messagesource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring15.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
//		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
	}
}
