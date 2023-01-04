package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);
		magition.setHp(0);
		magition.attack();
		
		Archer archer = new Archer();
		archer.setDex(0);
		archer.setLevel(5);
		archer.attack();
		
//		Character character = new Character();
	}
}
