package com.morningstar.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//@component define the class as springbean
@Component
//@Controller
//@Service
//@Repository
public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

//	@Autowired
//	@Qualifier("circleRelated")
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: ("+center.getX()+", "+center.getY()+")");
	}
}
