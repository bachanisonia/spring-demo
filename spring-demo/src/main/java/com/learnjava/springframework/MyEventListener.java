package com.learnjava.springframework;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Listening to the event : " + event.toString());
	}

}
