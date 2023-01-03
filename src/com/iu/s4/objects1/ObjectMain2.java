package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		// 객체 생성
		// Sword Instance 생성
		
		Sword s1 = new Sword();
		s1.name = "집행검"; //  name : Instance 변수
		s1.damage = 50;
		s1.life = 200;
		s1.price = 50000;
		s1.level = 3;
		
		Knight k1 = new Knight();
		k1.name = "물주먹";
		k1.hp = 100;
		k1.str = 30;
		k1.heal = 50;
		k1.dex = 20;
		k1.wiz = 10;
		
		k1.sword = s1;
		
		System.out.println(k1.sword.name);
		
		// 변수 선언
		Sword s2 = null;
		System.out.println(s2.damage);
		
	}
}
