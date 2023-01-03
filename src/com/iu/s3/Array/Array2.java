package com.iu.s3.Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[3];
		int [] ar2 = new int[2];

		// 키보드로 부터 숫자르 입력 받아서 해당 숫자만큼 배열을 생성 int
		System.out.print("숫자를 입력 하세요 : ");
		int count = sc.nextInt();
		int [] ar3 = new int[count];
		
		// 배열 크기만큼 배열 값을 입력
		for(int i = 0; i < count; i++) { // i < ar3.length; 도 가능
			System.out.print(i + 1 + "번째 값을 입력 하세요 : ");
			ar3[i] = sc.nextInt();
		}
		
		// 값들을 출력
		for(int i = 0; i < count; i++) {
			System.out.println(ar3[i]);
		}
		
		System.out.println(ar[4]);
	}
}
