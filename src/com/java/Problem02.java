package com.java;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		sum = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= sum; i++) {
			for (int num = 1; num <= i; num++) {
				System.out.print(i);
			}
			
			System.out.println();
		}

	}
}
