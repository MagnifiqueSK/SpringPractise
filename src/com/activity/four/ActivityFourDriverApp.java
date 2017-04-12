package com.activity.four;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityFourDriverApp {

	public static void main(String[] args) {

		// create the spring container by loading the config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextJavaAnnotations.xml");
		
		// retrieve the bean
		Coach theCoach =  context.getBean("theTennisCoach", Coach.class);
		
		// access the methods
		System.out.println(theCoach.getInstructions());
		
		// close the context
		context.close();
		
		
	}

}
