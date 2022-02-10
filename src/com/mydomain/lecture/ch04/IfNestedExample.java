package com.mydomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score = 51;
		String grade = " ";
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		if(score >= 80) {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		if(score >= 70) {
			if(score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		if(score >= 60) {
			if(score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		}
		if(score < 60)
			grade = "F";
		
		System.out.println("학점은: " + grade);
		
		
	}

}
