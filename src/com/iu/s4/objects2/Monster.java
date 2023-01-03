package com.iu.s4.objects2;

public class Monster {
	
	// 멤버변수, Instance 변수
	int power = 100;
	int hp;
	
	// 생성자 Constructor
	public Monster() {
		// 매개변수가 없는 생성자를 기본생성자 라고 함 => default Constructor
		this.power = 50;
		this.hp = 60;
		System.out.println("생성자 실행");
	}
	
	public Monster(int power) {
		
	}
	
	// 멤버메서드, Instance method
	
	public boolean checkValue(Monster monster) {
		// 나의 power와 같고, 나의 hp가 같다면 true 리턴, 하나라도 틀리면 false 리턴
		if(this.power == monster.power && this.hp == monster.hp) {
			return true;
		} else {
			return false;
		}
	}
	
	public void info(int a) {
		
	}
	// 공격
	// 돌아다니기
	public void info() {
		// 참조변수 this : class 내에서만 사용 가능, 생성된 객체주소를 담고있음
		System.out.println(this);
		System.out.println(this.power);
		// this는 생략 가능
		System.out.println(hp);
		// this.attack();
		attack();
	}
	
	public void attack() {
		System.out.println("공격합니다");
//		this.info();
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}
