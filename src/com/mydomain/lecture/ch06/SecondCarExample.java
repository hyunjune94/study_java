package com.mydomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {

		SecondCar secondCar = new SecondCar();		
		
		System.out.println("secondCar.company: " + secondCar.company);
		System.out.println("secondCar.model: " + secondCar.model);
		System.out.println("secondCar.color: " + secondCar.color);
		System.out.println("secondCar.maxSpeed: " + secondCar.maxSpeed);

		
		SecondCar secondCar2 = new SecondCar("아반떼");
		
		System.out.println("-----------------------------------------");
		System.out.println("secondCar2.company: " + secondCar2.company);
		System.out.println("secondCar2.model: " + secondCar2.model);
		System.out.println("secondCar2.color: " + secondCar2.color);
		System.out.println("secondCar2.maxSpeed: " + secondCar2.maxSpeed);
		
		
		SecondCar secondCar3 = new SecondCar("소나타", "blue");
		
		System.out.println("-----------------------------------------");
		System.out.println("secondCar3.company: " + secondCar3.company);
		System.out.println("secondCar3.model: " + secondCar3.model);
		System.out.println("secondCar3.color: " + secondCar3.color);
		System.out.println("secondCar3.maxSpeed: " + secondCar3.maxSpeed);
		
		
		SecondCar secondCar4 = new SecondCar("그랜저", "black", 300);
		
		System.out.println("-----------------------------------------");
		System.out.println("secondCar4.company: " + secondCar4.company);
		System.out.println("secondCar4.model: " + secondCar4.model);
		System.out.println("secondCar4.color: " + secondCar4.color);
		System.out.println("secondCar4.maxSpeed: " + secondCar4.maxSpeed);
	}

}
