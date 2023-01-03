package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// FPS 게임
		// 총알 30발 -> 1탄창
		// 캐릭터당 -> 3탄창
		// 1.단발  2.점사
		// 1번이면 "탕" 30번 반복 출력
		// 2번이면 "타타탕" 10번 출력
		// 다쓰면 탄창갈고 또 쏠지 물어보기
		
//		 강사님이 짠 코드
//		for(int t = 1; t < 4; t++) {
//			System.out.print("1.단발  2.점사 : ");
//			int select = sc.nextInt();
//			System.out.println(select);
//			
//			if(select == 1) {
//				for(int b = 1; b < 31; b++) {
//					System.out.println(b + "번째 소리: 탕");
//				}
//			} else {
//				for(int b = 1; b < 11; b++) {
//					System.out.println(b + "번째 소리: 타타탕");
//				}
//			}
//			System.out.println("탄창 하나 소비");
//		}
		
		// for 두번만 사용해서 작성한 코드
		for(int t = 1; t < 4; t++) {
			System.out.print("1.단발  2.점사 : ");
			int select = sc.nextInt();
			System.out.println(select);
			
			int count = 10;
			String sound = "타타탕";
			
			if(select == 1) {
				sound = "탕";
				count = 30;
			}
			
			for(int i = 1; i < count + 1; i++) {
				System.out.println(i + "번째 소리: " + sound);
			}
		}
		
		// 내가 짠 코드
//		for(int i = 3; i > 0; i--) {
//				System.out.print("1.단발  2.점사 : ");
//				int choice = sc.nextInt();
//				System.out.println(choice + "선택");
//				if(choice == 1) {
//					System.out.println("남은 탄창: " + i);
//					for(int t = 30; t > 0; t--) {
//						System.out.println(t + "번째 소리: 탕");
//					}
//				} else {
//					System.out.println("남은 탄창: " + i);
//					for(int t = 10; t > 0; t--) {
//						System.out.println(t + "번째 소리: 타타탕");
//					}
//				}
//			}
//			System.out.println("남은 탄창 없음");
//		}
	}
}