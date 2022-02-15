package com.mydomain.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

//		int[] score;
//		
//		int score2[];
//		
//		int[] score3 = {1,2,3};
//		
//		int score[] = {4,5,6};
//		
//		double score5[] = {1,2,3,4};
//		
//		String score6[] = {"강현준","전지현","고소영","장동건"};
		
		int score[] = {83,90,81,99};
		
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("score[3]: " + score[3]);

		int sum = 0;
		
		for(int i=0; i<4; i++) {
			sum += score[i];
		}
		double avg = (double) sum / 4;
		
		System.out.println("총합은: " + sum);
		System.out.println("평균은: " + avg);
	}

}
