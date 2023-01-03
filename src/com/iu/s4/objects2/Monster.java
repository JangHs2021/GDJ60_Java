package com.iu.s4.objects2;

public class Monster {
	
	// 멤버변수, Instance 변수
	int power;
	int hp;
	
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
