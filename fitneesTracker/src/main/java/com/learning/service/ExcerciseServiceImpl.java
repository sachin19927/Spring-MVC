package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.model.Activity;


@Service("excercises")
public class ExcerciseServiceImpl implements ExcerciseService {

	@Override
	public List<Activity> finndAllActivites() {
		
		List<Activity> result=new ArrayList<Activity>();
		
		
		
		Activity run=new Activity();
		run.setDesc("Run");
		result.add(run);
		
		

		Activity bike=new Activity();
		bike.setDesc("bike");
		result.add(bike);
		
		

		Activity swim=new Activity();
		swim.setDesc("swim");
		result.add(swim);
		
		
				 
		
		return result;
	}

	
}
