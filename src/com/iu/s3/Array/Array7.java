package com.iu.s3.Array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {5, 1, 4};
		boolean check = true;
	
		
		// 1. 데이터추가 2.데이터삭제 3.종료   // 3번 누를 때까지 계속
		// 데이터 추가 0번 인덱스에 추가
		// 데이터 삭제 0번 인덱스 삭제
			
		while(check) {
			System.out.println("1.데이터 추가  2.데이터 삭제  3.프로그램 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("추가할 데이터를 입력 : ");
				int num = sc.nextInt();
				int [] plus = new int[ar.length + 1];
				plus[0] = num;
				
				for(int i = 0; i < ar.length; i++) {
					plus[i + 1] = ar[i];
				}
				ar = plus;
				for(int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}	
			} else if(select == 2) {
				int [] del = new int[ar.length - 1];
				for(int i = 0; i < del.length; i++) {
					del[i] = ar[i + 1];
				}
				ar = del;
				for(int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
			} else {
				System.out.println("프로그램 종료");
				check = false;
			}
		}
	}
}
