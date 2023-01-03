package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		int id = 1234;
		int pwd = 5678;
		boolean flag = false;
		
		// 키보드로 부터 id, pw를 입력 받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		int ID = sc.nextInt();
		
		System.out.print("패스워드: ");
		int PWD = sc.nextInt();
		
		// 로그인이 성공 했을 때만 실행
		// 급여를 입력
		// 정규직이면 1을 , 계약직이면 2를 입력
		// 실급여 계산
		// 정규직: 받은 급여 - 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1% 최종급여 출력
		// 계약직: 원천징수 3.3% 실급여 출력
		
		if (id == ID && pwd == PWD) {
			System.out.println("로그인 성공");
			flag = true;
		} else {
			System.out.println("로그인 실패");
			flag = false;
		}
		
		if (flag) {
			System.out.print("급여를 입력하세요: ");
			int money = sc.nextInt();
			System.out.print("1.정규직  2.계약직: ");
			int num = sc.nextInt();
			if (num == 1) {
				int tax1 = (int)(money * 0.02);
				int tax2 = (int)(money * 0.03);  
				int tax3 = (int)(money * 0.01);  
				int tax4 = (int)(money * 0.01);
				
				money = money - (tax1 + tax2 + tax3 + tax4);
				
				System.out.println("최종급여(정규직): " + money + "원");
			} else {
				money = (int)(money * 0.967);
				System.out.println("최종급여(계약직): " + money + "원");
			}
		}
	}
}
