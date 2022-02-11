package com.mydomain.lecture.ch04;

public class Exc {

	public static void main(String[] args) {

		int x = 0;
		int y = -5;
		
		if(x > 0 && y > 0) {
			System.out.println("1사분면");
		} 
		else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4사분면");
		}
		else {
			System.out.println("none");
		}

	}

}
