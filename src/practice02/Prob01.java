package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner sc = new Scanner(System.in);
		int userMoney = 0;

		System.out.print("금액 : ");
		userMoney = sc.nextInt();

		int[] moneyCount = new int[10]; // 각 돈의 갯수만큼 count해서 배열에 입력

		for (int i = 0; i < MONEYS.length; i++) {
			moneyCount[i] = userMoney / MONEYS[i];
			userMoney %= MONEYS[i];
			System.out.println(MONEYS[i] + "원 : " + moneyCount[i]);
		}
	}
}
