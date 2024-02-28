package com.learnjava.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher eventPublisher;
	
	@Autowired
	private MessageSource messageSource;
	
	public Point getCenter() {
		return center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	//@Required
	//@Autowired
	//@Qualifier("pointA") --> This works too
	//@Qualifier("circleRelated")
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.getMessageSource().getMessage("drawing.cirle", new Object[] {this.getCenter().getX(),this.getCenter().getY()}, "Default Drawing circle", null));
		//System.out.println("Drawing a cirlce with center co-ordinates as : (" + this.getCenter().getX() + "," + this.getCenter().getY() + ")" );
		//System.out.println(this.getMessageSource().getMessage("greeting", null, "Default greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		eventPublisher.publishEvent(drawEvent);
		
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("Initializing the circle through initCircle method...");
	}
	
	@PreDestroy
	public void cleanUpCircle() {
		System.out.println("Cleaning up the circle through cleanUpCircle method...");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}


}
