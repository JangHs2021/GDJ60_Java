package com.iu.s2.loops;

public class LoopFor3 {

	public static void main(String[] args) {
		// 이중 for문
		// 구구단
		
		// 2 * 1 = 2    3 * 1 = 3
		// 2 * 2 = 4	3 * 2 = 6
		// 2 * 3 = 6	3 * 3 = 9
		// ...			...
		// 2 * 9 = 18   3 * 9 = 27
		
		for(int j = 2; j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + j * i);
			}
		}
	}
}
