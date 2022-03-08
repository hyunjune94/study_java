package com.mydomain.lecture;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름: 7");
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행 원면적: " + calculator.getArea(7));		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행 원면적: " + computer.getArea2(7));
	}

}
