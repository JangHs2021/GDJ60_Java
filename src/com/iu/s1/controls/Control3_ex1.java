package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// Game : TRPG
		// 법사
		String name ="핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		// 1. HP보충(포션) 2. MP보충 3. 마법1 4. 마법2 5. 턴 넘기기
		// HP MP 보충시 최대 40이 끝
		// 보충시 랜던하게 0 ~ 40 사이의 숫자를 받아서 HP MP에 더하기
		// 마법은 프린트로 처리
		
		System.out.println("1.HP보충  2.MP보충  3.마법1  4.마법2  5.턴 종료");
		int select = sc.nextInt();
		int Max = 40;
		
		if (select == 1) {
			int hpHeal = random.nextInt(41);
			System.out.println("현재 체력 : " + hp);
			System.out.println("체력 회복량 : " + hpHeal);
			hp = hp + hpHeal;
			if (hp <= 40) {
				System.out.println("법사 체력 : " + hp);
			} else {
				System.out.println("법사 체력 : " + Max);
			}
		} else if (select == 2) {
			int mpHeal = random.nextInt(41);
			System.out.println("현재 마나 : " + mp);
			System.out.println("마나 회복량 : " + mpHeal);
			mp = mp + mpHeal;
			if (mp <= 40) {
				System.out.println("법사 마나 : " + mp);
			} else {
				System.out.println("법사 마나 : " + Max);
			}
		} else if (select == 3) {
			// 주문을 외우기
			// MP -3
			// 0 ~ 5이하의 수치를 공격
			// 5 뜨면 크리티컬
			System.out.println("마법1을 썼다");
			int Attack1 = random.nextInt(6);
			System.out.println("오크에게 데미지 : " + Attack1);
			if (Attack1 > 0) {
				if (Attack1 == 5) {
					System.out.println("크리티컬!!!!");
				}
				monsterHp = monsterHp - Attack1;
				System.out.println("오크 체력 : " + monsterHp);
			} else {
				System.out.println("빗나감");
				System.out.println("오크 체력 : " + monsterHp);
			}
		} else if (select == 4) {
			// 주문을 외우기
			// MP -5
			// 0 ~ 10이하의 수치를 공격
			// 10 뜨면 크리티컬
			System.out.println("마법2를 썼다");
			int Attack2 = random.nextInt(11);
			System.out.println("데미지 : " + Attack2);
			if (Attack2 > 0) {
				if (Attack2 == 10) {
					System.out.println("크리티컬!!!!");
				}
				monsterHp = monsterHp - Attack2;
				System.out.println("오크 체력 : " + monsterHp);
			} else {
				System.out.println("빗나감");
				System.out.println("오크 체력 : " + monsterHp);
			}
		} else {
			System.out.println("턴 종료");
		} 
		
		// 유저의 이름과 HP, MP
		// 몬스터의 이름과 HP
		System.out.println("=================================");
		System.out.println("유저 이름 : " + name);
		if (hp >= 40) {
			System.out.println("HP : " + Max);
		} else {
			System.out.println("HP : " + hp);
		}
		if (mp >= 40) {
			System.out.println("MP : " + Max); 
		} else {
			System.out.println("MP : " + mp); 
		}
		System.out.println("=================================");
		System.out.println("몬스터 이름 : " + monsterName);
		System.out.println("HP : " + monsterHp);
	}
}
