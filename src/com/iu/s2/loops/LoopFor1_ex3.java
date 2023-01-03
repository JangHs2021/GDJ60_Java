package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		// 로그인 시도 총 5번 시도가능
		// 반복문 종료 후 
		// 로그인이 성공 했으면 "환영합니다" 출력
		// 로그인이 실패 했으면 "은행 방문하세요" 출력
		int ID = 0;
		int PW = 0;
		// boolean check = false;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("아이디: ");
			ID = sc.nextInt();
			System.out.print("패스워드: ");
			PW = sc.nextInt();
			if(id == ID && pw == PW) {
				System.out.println("로그인 성공");
				i = 6;
				// break;
				// check = true;
			} else {
				System.out.println("로그인 실패");
			}
		}
		if(id == ID && pw == PW) { // check
			System.out.println("환영합니다");
		} else {
			System.out.println("은행에 방문하세요");
		}
	}
}
