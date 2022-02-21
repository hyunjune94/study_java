package com.mydomain.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean korean = new Korean();
		
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);

		korean.name = "강현준";
		korean.ssn = "123456789";
		
		System.out.println("-------------------------------------");
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);
		
		Korean korean2 = new Korean("전지현", "987654321");
		
		System.out.println("-------------------------------------");
		System.out.println("korean2.nation: " + korean2.nation);
		System.out.println("korean2.name: " + korean2.name);
		System.out.println("korean2.ssn: " + korean2.ssn);

	}

}
