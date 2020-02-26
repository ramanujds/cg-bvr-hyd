package com.capg.web.service;

public class CalculatorService {

	public float calculate(int x,int y,String option) {
		float result=0;
		switch(option.toLowerCase()) {
		case "add":
			result=x+y;
			break;
		case "subtract":
			result=x-y;
			break;
		case "multiply":
			result=x*y;
			break;
		case "divide":
			result=x/(float)y;
			break;
		}
		return result;
	}
}
