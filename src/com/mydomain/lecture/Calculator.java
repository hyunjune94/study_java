package com.mydomain.lecture;

public class Calculator {
	
	double result = 0;
	
	public double getArea(double param) {			
		
		result = param * param * Constants.PAI_1;		
			
		return result;
	}

	public double getArea2(double param) {			
			
		result = param * param * Constants.PAI_2;		
			
		return result;
	}

}
