package com.iu.s4.objects3.p1;

public class Member {
	
	// 비만 관리 회원등록
	private String name;
	private int age;
	private double cm;
	private double kg;
	private boolean check;
	
	public Member() {}
	
	public Member(int age) {
		if(age > 0 || age < 200) {
			this.age = age;
		}
	}
	
	// setter 메서드
	// set + 변수명의 첫글자를 대문자로 바꾼것
	public void setAge(int age) {
		if(age > 0 && age < 200) {
			this.age = age;			
		}
	}
	
	// getter 메서드
	// get + 변수명의 첫글자를 대문자로 바꾼것
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCm() {
		return cm;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}
	
	

	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Cm : " + this.cm);
		System.out.println("Kg : " + this.kg);
	}
}
