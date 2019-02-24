package com.morningstar.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring14.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
