package com.iu.s3.Array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 학생 수 입력
		// 2. 학생 수 만큼 이름을 입력
		// 3. 학생 수 만큼 학생의 번호, 국어, 영어, 수학 입력 
		// a 학생의 번호 :
		// a 학생의 국어 :
		// a 학생의 영어 :
		// a 학생의 수학 :
		// b 학생의 번호 :
		// ....
		// 점수 총점 평균 계산
		// 모든 학생의 정보 출력
		// 이름   번호   국어   영어   수학   총점   평균
		// a     1     60    70    50   180   60
 		// ...
		
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		
		String [] name = new String[count];
		int [] nums = new int[count]; //[name.length]
		int [] kor = new int[count];
		int [] eng = new int[count];
		int [] math = new int[count];
		int [] total = new int[count];
		double [] avg = new double[count];
		
		for(int i = 0; i < count; i++) { // i < name.length
			System.out.print(i + 1 + "번째 이름 입력 : ");
			name[i] = sc.next();
		}
		
		System.out.println();
		
		for(int i = 0; i < count; i++) {
			System.out.print(name[i] + "번째 학생의 번호 : ");
			nums[i] = sc.nextInt();
			System.out.print(name[i] + "번째 국어 점수 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print(name[i] + "번째 영어 점수 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print(name[i] + "번째 수학 점수 입력 : ");
			math[i] = sc.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}
		
		System.out.println("====== 모든 학생의 정보 출력 ======");
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(int i = 0; i < count; i++) {
			System.out.println(name[i] + " \t " + nums[i] + " \t " + kor[i] + " \t " + eng[i] + " \t " + math[i] + " \t " + total[i] + " \t" + avg[i]);
		}
	}
}
