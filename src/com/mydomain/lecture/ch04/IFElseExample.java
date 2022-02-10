package com.mydomain.lecture.ch04;

public class IFElseExample {

	public static void main(String[] args) {
		
		int score = 45;
		
		int A = 0;
		int B = 0;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 80보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 70보다 작습니다.");
			System.out.println("등급은 c 입니다.");
		} else if(score >= 60) {
			System.out.println("점수가 60보다 작습니다.");
			System.out.println("등급은 d 입니다.");
		} else {
			System.out.println("점수가 50보다 작습니다.");
			System.out.println("등급은 f 입니다.");
		}
		
		if(A > B) {
			System.out.println(">");
		}
		else if(A<B){
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	
	}
}

	