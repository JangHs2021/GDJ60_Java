package com.iu.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		// 단일 if
		// if(조건식){ 조건식이 true일 때 실행 }
		// 졸업시험, 무조건 졸업 평균 90점이상이면 우등상 수상
		System.out.println("프로그램 시작");
		
		double avg = 90.12; // >, <...
		boolean check = true;
		int money = 0;
		
		if(avg >= 90) {
			System.out.println("우등상 수상");
			System.out.println("장학금 :" + money);
			System.out.println(check);
			money = 100000000;
		} // if 끝
		
		System.out.println("장학금 :" + money);
		System.out.println("졸업을 축하 합니다");
		System.out.println("프로그램 종료");
	}
}
