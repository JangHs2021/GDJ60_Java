package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 수를 입력
		// 학생수 만큼 점수를 입력 받아서
		// 총 합계 출력
//		System.out.print("학생 수 입력: ");
//		int num = sc.nextInt();
//		int score = 0;
//		int sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.print("점수 입력: ");
//			score = sc.nextInt();
//			
//			sum = sum + score;
//		}
//		System.out.println("총 합계: " + sum);
		
		System.out.println("초를 입력하세요"); // 5
		int j = sc.nextInt();
		
		for(int i = 0; i < 60; i++) {
			System.out.println(i + "초");
			if(i == j) {
				i = 59;
				// break;
			}
		}
		System.out.println("종료");
	}
}
