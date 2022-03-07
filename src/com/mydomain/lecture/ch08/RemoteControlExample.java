package com.mydomain.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {

//		Audio audio = new Audio();		
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
	//	인터페이스를 구현한 클래스는 위에처럼 일반클래스 객체 만들듯이 하면 안됨
		
	//	인터페이스를 구현한 클래스를 사용해야 된다. 할때는		
//		RemoteControl remoteControl;
//		remoteControl = new Audio();
//		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();

	}

}
