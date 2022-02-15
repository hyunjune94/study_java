package com.mydomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {

		int num1[] = {2,3,4,5,6,7,8,9};
		int num2[] = {2,3,4,5,6,7,8,9};
	
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				System.out.println(num1[i] + "*" + num2[j] + "=" + num1[i]*num2[j]);
			}		
			
		}
		
	}

}
