package com.mydomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		
		int num[] = new int[6];

		for(int i=0; i<6; i++) {
			num[i] = (int) (Math.random() * (45 - 1 + 1) + 1);
			for(int j=0; j<6; j++)
				if(i != j && num[i] == num[j]) {
					num[i] = (int) (Math.random() * (45 - 1 + 1) + 1);
				}
			System.out.println(num[i]);		
		}

	}

}
