package com.mydomain.lecture.ch03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		
		int score = 65;
		
//		char grade = (score > 90 ? 'A' : 'B');
		char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));
		
		System.out.println("grade: " + grade);

	}

}
