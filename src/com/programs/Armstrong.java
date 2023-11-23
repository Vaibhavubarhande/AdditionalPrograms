package com.programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		int rem = 0;
		int arm = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong");

		int n = sc.nextInt();

		int num = n;

		while (n > 0) {
			rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;
		}
		if (num == arm) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}

}
