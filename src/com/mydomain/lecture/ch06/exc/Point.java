package com.mydomain.lecture.ch06.exc;

import java.util.Date;

public class Point {
	String ifmm = "";
	String ifmmPassword = "";
	String ifmmName = "";
	String ifmmPhoneNumber = "";
	String ifmmAccount = "";
	String point = "";
	Date pointSavedDate;
	Date pointUsedDate;
	
	
//	회원 인증
	public void memberCertification(String ifmmName, String ifmmPhoneNumber) {
		
	}
	
//	포인트 적립 
	public void savePoint(String ifmmAccount, String point, Date pointSavedDate) {
		
	}
	
//	포인트 사용
	public void usePoint(String ifmmAccount, String point, Date pointUsedDate) {
		
	}
	
//	포인트 조회
	public void pointCheck(String ifmmName, String ifmmPassword) {
		
	}
}

