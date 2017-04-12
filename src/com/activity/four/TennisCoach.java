package com.activity.four;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {
	
	public TennisCoach(){
		System.out.println("Inside the default Constructor:  ");
	}

	@Override
	public String getInstructions() {
		return "Practise forehand!";
	}

}
