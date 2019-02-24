package com.morningstar.codetointerface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring13.xml");
		context.registerShutdownHook();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
}
