package com.mydomain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("hyunjune", "1234-5678", 21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
	

		Student student2 = new Student("hyun", "1234-5678");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
	
	}	

}