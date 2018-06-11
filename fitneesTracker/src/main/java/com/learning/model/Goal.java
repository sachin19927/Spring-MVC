package com.learning.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

public class Goal {

	
	
	
	@Range(min=1,max=120)
	private int minutes;

	
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
