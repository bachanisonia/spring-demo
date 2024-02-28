package com.learnjava.springframework;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, InitializingBean, DisposableBean  {
	
	/*
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	private String beanName;
	
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Co-ordinates of the given triangle are (" + this.getPointA().getX() + "," + this.getPointA().getY() + ") , (" + this.getPointB().getX() + "," + this.getPointB().getY() + ") , (" + this.getPointC().getX() + "," + this.getPointC().getY() + ")" );
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	// This is called when the application context is initialized in the DrawingApp class
	@Override
	public void setBeanName(String beanName) {
		
		this.beanName = beanName;
		System.out.println("Bean Name : " + beanName);
	}
	
	*/
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		
		System.out.println("Co-ordinates of the given triangle are : ");
		for(Point point : points) {
			System.out.println("(" + point.getX() + "," + point.getY() + ")");
		}
	}
	
	public void myInit() {
		System.out.println("Initializing the bean through my init method...");
	}
	
	public void myCleanup() {
		System.out.println("Disposing off the bean through my clean up method... ");
	}

	// This gets called when the bean is being initialized
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing the bean...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposing off the bean... Byee ! ");
	}
	
	/*
	private String type;
	private Integer height;
	
	public Triangle(String type) {
		this.type = type;
		System.out.println("Instiantiated by the one arg type constructor");
	}
	
	public Triangle(Integer height) {
		this.height = height;
		System.out.println("Instiantiated by the one arg height constructor");
	}
	
	public Triangle(String type, Integer height) {
		this.type = type;
		this.height = height;
		System.out.println("Instiantiated by the two arg constructor");
	}
	
	public String getType() {
		return type;
	}

	
	public Integer getHeight() {
		return height;
	}

	public void setType(String type) {
		this.type = type;
		System.out.println("Instiantiated by the setter method");
	}

	public void draw() {
		
		System.out.println("Drawing a " + this.height + " high " + this.getType() + " triangle");
	}
	*/

}
