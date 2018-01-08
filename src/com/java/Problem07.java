package com.java;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		int bank = 0;
		int bankmoney = 0;
		boolean run = true;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예긂 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			bank = scan.nextInt();
			scan.nextLine();

			if (bank == 1) {
				System.out.println("여급액을 입력해주세요>");
				bankmoney += scan.nextInt();
				System.out.println("예금액>" + bankmoney);
			} else if (bank == 2) {
				System.out.println("출금액을 입력해주세요>");
				bankmoney -= scan.nextInt();
				System.out.println("출금액" + bankmoney);
				
			} else if (bank == 3) {
				System.out.println("잔금액>" + bankmoney);
			} else if (bank == 4) {
				System.out.println("프로그램 종료");
				break;
			} else{
				System.out.println("다시입력해 주세요");

			}
		}

	}
}
