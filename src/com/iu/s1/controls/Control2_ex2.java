package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		int sum = 0;
		double avg = 0.0; 
		
		sum = kor + eng + math;
		avg = sum / 3;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		// 평균이 60점 이상인가?
		// 과목당 40점 미만이면 불합격
		// 합격 불합격 출력
		// if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			// System.out.println("합격");
		// } else {
			// System.out.println("불합격");
		// }
		
		// if(avg >= 60) {
		// 		if(kor >= 40 && eng >= 40 && math >= 40) {
		//			System.out.println("합격");
		//		} else {
		//			System.out.println("불합격");
		//		}
		//	} else {
		//		System.out.println("불합격");
		//	}
		boolean flag = false;
		
		if(avg >= 60) {
			flag = true;
		}
		
		if(kor < 40 || eng < 40 || math <40) {
			flag = false;
		} else {
			flag = true;
		}
		
		if(flag) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
