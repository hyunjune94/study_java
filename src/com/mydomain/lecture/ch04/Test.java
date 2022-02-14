package com.mydomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {

		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=2; i<=9; i++) {			
			for(int j=1; j<=9; j++) {				
				System.out.println(i + "*" + j + "=" + (i*j));
				if ((i*j) % 2 == 0) {
					sum1 += (i*j); 
				}
				else {
					sum2 += (i*j);
				}
			}
		}		
		System.out.println("짝수의 합:" + sum1);
		System.out.println("홀수의 합:" + sum2);	
		
	}
}
