package com.iu.s4.objects1;

public class MethodTest3 {
	
	// 실급여를 계산하는 메서드 3.3% 땐 금액
	public void t3(int salary, double tax) {
		salary = (int)(salary * tax);
		System.out.println("T3 : " + salary);
	}
	
	public void info(Sword sword) {
		// Swrod 모든 정보를 출력
		System.out.println(sword.name);
		System.out.println(sword.damage);
		sword.name = "단도";
	}
}
