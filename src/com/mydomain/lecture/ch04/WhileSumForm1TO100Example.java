package com.mydomain.lecture.ch04;

public class WhileSumForm1TO100Example {

	public static void main(String[] args) {
		
		int sum = 0;		
		int i=1;
		
		while(i<=10) {			
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
