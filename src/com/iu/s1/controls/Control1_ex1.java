package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// 키보드로 부터 국어, 영어, 수학 점수 입력 받음
		// 총점 과 평균 계산
		// 평균이 90점 이상이면 A를 출력
		// 평균이 80점 이상이면 B를 출력
		// 평균이 70점 이상이면 C를 출력
		// 그외 나머지 F를 출력
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
		
		String level = "F";
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		if(avg >= 90) {
			//System.out.println("A");
			level = "A";
		}
		
		if(avg >= 80 && avg < 90) {
			//System.out.println("B");
			level = "B";
		}

		if(avg >= 70 && avg < 80) {
			//System.out.println("C");
			level = "C";
		}
		
		/*
		if(avg < 70) {
			//System.out.println("F");
			level = "F";
		}
		*/
		
		// 출력문 한번만 사용
		//System.out.println(level);
	}
}
