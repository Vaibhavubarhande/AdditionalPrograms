package com.programs;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entet a number to check armastron or not");

		int num = sc.nextInt();
		int x = num;
		int rem = 0;
		int arm = 0;

		while (x > 0) {

			rem = x % 10;
			arm = (rem * rem * rem) + arm;
			x = x / 10;
		}

		if (arm == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
	}
}
