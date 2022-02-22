package com.mydomain.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		
		ThirdCar thirdCar = new ThirdCar();
		System.out.println("ThirdCar1.company: " + thirdCar.company);
		
		ThirdCar thirdCar2 = new ThirdCar("자가용");
		System.out.println("---------------------------------------");
		System.out.println("ThirdCar2.company: " + thirdCar2.company);
		System.out.println("ThirdCar2.model: " + thirdCar2.model);
		
		ThirdCar thirdCar3 = new ThirdCar("자가용", "빨강");
		System.out.println("---------------------------------------");
		System.out.println("ThirdCar3.company: " + thirdCar3.company);
		System.out.println("ThirdCar3.model: " + thirdCar3.model);
		System.out.println("ThirdCar3.color: " + thirdCar3.color);
		
		ThirdCar thirdCar4 = new ThirdCar("자가용", "빨강", 200);
		System.out.println("---------------------------------------");
		System.out.println("ThirdCar4.company: " + thirdCar4.company);
		System.out.println("ThirdCar4.model: " + thirdCar4.model);
		System.out.println("ThirdCar4.color: " + thirdCar4.color);
		System.out.println("ThirdCar4.maxSpeed: " + thirdCar4.maxSpeed);

	}

}
