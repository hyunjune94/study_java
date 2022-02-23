package com.mydomain.lecture.ch06;

public class SixthCarExample {

	public static void main(String[] args) {

		SixthCar myCar = new SixthCar("포르셰");	
		SixthCar yourCar = new SixthCar("벤츠");
		
		myCar.run();
		yourCar.run();
		
		print("sadf");

	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}

}
