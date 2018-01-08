package com.java;

public class Problem03 {

	public static void main(String[] args) {

		int dan = 0;
		int sum = 0;

		for (sum = 1; sum <= 9; sum++) {
			for (dan = 2; dan <= 9; dan++) {
				
			System.out.print(dan + "*" + sum + "=" + dan * sum+"|");
			
			}
			System.out.println();
		}

	}

}