package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	Scanner sc = new Scanner(System.in);
	
	// findStudent
	// 학생배열을 받아서
	// 학생의 번호를 입력받아서 일치하는 학생을 리턴 없으면 null
	public Student findStudent(Student [] students) {
		System.out.print("학생 번호 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < students.length; i++) {
			if(num == students[i].num) {
				return students[i];
			}
		}
		return null;
	}
	
	// setStudent 메서드
	// 학생 한명 객체 생성해서, 이름, 번호, 국어, 영어, 수학 입력
	// 총점 평균 계산
	public Student [] setStudent(Student [] students) { // +
		Student student = new Student();
		System.out.print("이름 : ");
		student.name = sc.next();
		System.out.print("번호 : ");
		student.num = sc.nextInt();
		System.out.print("국어 : ");
		student.kor = sc.nextInt();
		System.out.print("영어 : ");
		student.eng = sc.nextInt();
		System.out.print("수학 : ");
		student.math = sc.nextInt();
		
		student.total = student.kor + student.eng + student.math;
		student.avg = student.total / 3.0;
		
		Student [] newStudents = new Student[students.length + 1];
		for(int i = 0; i < students.length; i++) {
			newStudents[i] = students[i];
		}
		
		newStudents[students.length] = student;
		return newStudents; // +
	}
	
	// setAllStudent 메서드
	// 매개변수로 학생배열을 받아서
	// 배열의 수만큼 학생 객체를 생성해서 이름, 번호, 국어, 영어, 수학 입력
	// 총점 평균 계산
	// 학생 객체를 배열에 대입
	public void setAllStudent(Student [] students) {
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.print("이름 : ");
			student.name = sc.next();
			System.out.print("번호 : ");
			student.num = sc.nextInt();
			System.out.print("국어 : ");
			student.kor = sc.nextInt();
			System.out.print("영어 : ");
			student.eng = sc.nextInt();
			System.out.print("수학 : ");
			student.math = sc.nextInt();

			student.total = student.kor + student.eng + student.math;
			student.avg = student.total / 3.0;
			students[i] = student;
			
		}
	}
}
