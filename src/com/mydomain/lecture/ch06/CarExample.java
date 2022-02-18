package com.mydomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed);
		
		car.speed = 100;
		System.out.println("speed: " + car.speed);

		fastSlow(car.maxSpeed, car.speed);
		
	}
	public static void fastSlow (int maxSpeed, int speed) {
		
		if(maxSpeed > speed) {
			System.out.println("speed가 maxSpeed 보다 낮습니다.");
		} else if ( maxSpeed < speed) {
			System.out.println("speed가 maxSpeed 보다 높습니다.");
		} else {
			System.out.println("speed와 maxSpeed가 동일합니다");
		}		
	}
}
