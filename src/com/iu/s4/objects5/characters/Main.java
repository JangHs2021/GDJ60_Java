package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		Archer archer = new Archer();
		Knight knight = new Knight();
		
		Character character = null;
		
		character = archer;
		
		archer = (Archer)character;
		
		knight.attatck();
	}
}
