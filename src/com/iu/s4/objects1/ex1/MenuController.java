package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	// 메서드 start 호출
	// 1.등록  2.수정  3.삭제  4.종료
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.print("학생 수를 입력하세요 : ");
		int count = sc.nextInt();
		Student [] students = new Student[count];

		while(check) {
			System.out.println("1.학생 정보 입력 2.학생 검색 3.학생 전체 정보 출력 4.학생 추가 5.종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("학생 정보 입력");
				si.setAllStudent(students);
				break;
			case 2:
				System.out.println("학생 검색");
				Student student = si.findStudent(students);
				if(student != null) {
					sv.view(student);
				}else {
					System.out.println("찾으시는 학생이 없습니다");
				}
				break;
			case 3:
				System.out.println("학생 전체 정보 출력");
				sv.view(students);
				break;
			case 4:
				System.out.println("학생 추가");
				students = si.setStudent(students);
				break;
			default:
				System.out.println("종료");
				check = false;
			}
		}
	}
}
