package com.iu.s3.Array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {8, 5, 13, 9, 6};
		int [] copy = new int[ar.length - 1];
		int idx = 0;
		// 키보드로 부터 삭제하고 싶은 값을 입력 받기 ex) 9
		// 출력은 삭제한 것 빼고 프린트
		
		System.out.print("삭제 할 숫자 입력 : ");
		int del = sc.nextInt();

		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == del) {
				System.out.println(ar[i] + " 삭제");
				continue;
			}
			
			copy[idx] = ar[i];
			idx++;
		}
		
		ar = copy;
		System.out.println("===========");
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
