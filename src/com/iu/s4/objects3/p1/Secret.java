package com.iu.s4.objects3.p1;

public class Secret {
	public int point = 500;
	int money = 1000000000;
	
	public Secret() {
		
	}
	
	public void s1() {
		System.out.println("Secret의 s1 메서드 실행");
	} 
	
	void s2() {
		System.out.println("Default 메서드");
	}
}
