package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// 회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pwd = 5678;

		// 키보드로 부터 id, pw를 입력 받아서 로그인 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		int ID = sc.nextInt();
		
		System.out.print("패스워드: ");
		int PWD = sc.nextInt();
		
		if (id == ID && pwd == PWD) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
