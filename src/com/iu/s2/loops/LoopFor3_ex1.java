package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 분과 초를 입력받아서 해당 분 초가 되면 반복문을 모두 종료 ex) 1분 10초 찍으면 종료
		
		System.out.print("분을 입력: ");
		int num1 = sc.nextInt();
		System.out.print("초를 입력: ");
		int num2 = sc.nextInt();
		
		for(int b = 0; b < 60; b++) {
			for(int s = 0; s < 60; s++) {
				System.out.println(b + "분" + s + "초");
				if(num1 == b && num2 == s) {
					b = 60;
					break;
				}
			}	
		}
		System.out.println("프로그램 종료");
	}
}
