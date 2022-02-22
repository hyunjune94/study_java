package com.mydomain.lecture.ch06;

public class ThirdCalculator {

	double result = 0;
	
	double areaRectangle(int x) {
		
		result = x * x;
		
		return result;
	}
	
	double areaRectangle(int x, int y) {
		
		result = x * y;
		
		return result;
	}
}
