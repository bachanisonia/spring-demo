package com.learnjava.springframework;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		//triangle.draw();
		
		//DefaultListableBeanFactory factory = new DefaultListableBeanFactory( (BeanFactory) new ClassPathResource("Spring.xml") );
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("Spring.xml");
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		// When the program ends, the shutdown of context begins - destroying the beans
		context.registerShutdownHook();
		//Shape triangle = (Shape) context.getBean("triangle1");
		//triangle.draw();
		//System.out.println(context.getMessage("greeting", null , "Default Greeting", null));
		Shape circle = (Shape) context.getBean("circle");
		circle.draw();
		

	}

} 
