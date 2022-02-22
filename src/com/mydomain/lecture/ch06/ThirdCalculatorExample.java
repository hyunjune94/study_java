package com.mydomain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {

		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double result1 = thirdCalculator.areaRectangle(3);
		
		double result2 = thirdCalculator.areaRectangle(3,7);
		
		System.out.println("사각형의 넓이: " + result1);
		System.out.println("사각형의 넓이: " + result2);

	}

}
