package com.control_statement;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner r = new Scanner(System.in);
		int revs = r.nextInt();
		r.close();
		int a = revs, b, c = 0;
		while (a > 0) {
			b = a % 10;
			c = (c * 10) + b;
			a = a / 10;
		}
		if (revs == c) {
			System.out.println("Palindrome");
		} else
			System.out.println("Non palindrome");
	}
}
