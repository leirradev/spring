package com.morningstar.beandefinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		Triangle triangle = (Triangle) context.getBean("triangle2");
		triangle.draw();
	}
}
