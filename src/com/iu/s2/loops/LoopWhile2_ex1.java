package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ID = 1234;
		int PW = 5678;
//		int Gold = 0;
//		int Level = 1;
//		int MonsterSu = 0;
		boolean check = true;
		// MMORPG게임
		// 1.로그인
		// 2.로그인 한 사용자만 게임 가능    로그인 할때 까지 무한루프
		
		// ----------------- 로그인 파트 -----------------
		// 1.로그인 2.종료
		// 1: id, pw 입력 후 로그인 판단
		// 2: 프로그램 종료
		
		// ----------------- 게임 진행 파트 ---------------
		// 1. 로그인 성공 했을 때 진행 o
		// 레벨 1 시작 o
		// 모든 몬스터의 경험치는 동일 o
		// 몬스터 잡으면 수 에따라 몬스터 사냥 성공, 레벨업 하면 레벨업 축하 메시지 o
		// 초기 골드 : 0 o
		// 5렙 달성시 1000골드 지급 골드 지급 메시지 띄우기 o
		// 10렙 달성시 2000골드 지급 o
		// 15렙(만렙) 달성시 3000골드 지급 o
		// 레벨 1 -> 2  잡아야 하는 몬스터 수 : 3 o
		// 레벨 2 -> 3  잡아야 하는 몬스터 수 : 6 o
		// 레벨 3 -> 4  잡아야 하는 몬스터 수 : 9 o
		// 레벨 4 -> 5  잡아야 하는 몬스터 수 : 12 o
		// .... o
		// 레벨 14 -> 15  잡아야 하는 몬스터 수 : 42 o
		// 만렙 15 o
		// 최종 만렙 달성 축하, 현재 골드 출력(총 : 6000골드) o
		
		// 강사님이 짠 코드
		while(check) {
			System.out.println("1.로그인  2.종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("로그인");
				System.out.print("ID : ");
				int id = sc.nextInt();
				System.out.print("PW : ");
				int pw = sc.nextInt();
				
				if(ID == id && PW == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("프로그램 종료");
				check = !check;
			}
		}
		
		if(check) {
			int level = 1;
			int gold = 0;
			
			for(level = 1; level < 15; level++) {
				System.out.println("현재 레벨 : " + level);
				
				if(level % 5 == 0) {
					gold = gold + level/5 * 1000;
					System.out.println("골드 지급: " + gold + " Gold");
				}	

//				if(level == 5) {
//					System.out.println("5렙 달성 축하금");
//					gold = gold + 1000;				
//				}
//				if(level == 10) {
//					System.out.println("10렙 달성 축하금");
//					gold = gold + 2000;				
//				}
				
				for(int m = 0; m < level * 3; m++) {
					System.out.println(m + 1 + "마리 사냥 성공");
				}
				System.out.println("축 레벨업");
			}
			System.out.println(level + " 렙 달성 축하");
			gold = gold + level/5 * 1000;
			System.out.println("Gold : " + gold);
		}
		
		// 내가 짠 코드
//		while(check) {
//			System.out.println("1.로그인  2.종료");
//			int choice = sc.nextInt();
//		
//			if(choice == 1) {
//				System.out.println("로그인");
//				System.out.print("ID : ");
//				int id = sc.nextInt();
//				System.out.print("PW : ");
//				int pw = sc.nextInt();
//				
//				if(ID == id && PW == pw) {
//					System.out.println("로그인 성공");
//					System.out.println("====================");
//					System.out.println("Game Start");
//					System.out.println("초기 골드 : " + Gold);
//					System.out.println("Lv : " + Level);
//					check = false;
//					
//					for(MonsterSu = 1; MonsterSu <= 42; MonsterSu++) {
//						System.out.println("몬스터 " + MonsterSu + "마리 사냥 성공");
//						if(MonsterSu % 3 == 0) {
//							Level++;
//							System.out.println("레벨업!!!!!");
//							System.out.println("====================");
//							System.out.println("Lv : " + Level);
//							if(Level == 15) {
//								System.out.println("만렙 달성!!!!");
//							}
//							if(Level % 5 == 0) {
//								Gold = Gold + 1000;
//								System.out.println("골드 지급: " + Gold + " Gold");
//							}	
//						} 				
//					}
//					System.out.println("====================");
//					System.out.println("만렙 달성 축하합니다");
//					System.out.println("총 골드: " + 6000 + " Gold");
//				} else {
//					System.out.println("로그인 실패");
//				}
//			} else {
//				System.out.println("프로그램 종료");
//				check = false;
//			}
//		}
	}
}
