package com.iu.s3.Array;

public class Array8 {

	public static void main(String[] args) {
		int [] ar = {9, 5, 8, 3, 6};
		int [] copy = new int[ar.length];
		// 9, 8, 6, 5, 3 => 내림차순
		// 3, 5, 6, 8, 9 => 오름차순
		
		// 방법 1
		// 0인덱스 : 1, 2, 3, 4 번째랑 비교 해서 더 큰거 찾기 후 자리 바꿈
		// 1인덱스 : 2, 3, 4 비교 // continue?
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 10; j++) {
				if(ar[0] > ar[i + 1]) {
					copy[0] = ar[0];
					
//					copy[0] = ar[0];
//					copy[1] = ar[2];
//					copy[2] = ar[4];
//					copy[3] = ar[1];
//					copy[4] = ar[3];
					
				} 
			}
		}
		
		ar = copy; 
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
