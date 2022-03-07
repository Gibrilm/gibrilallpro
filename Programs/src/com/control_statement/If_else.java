package com.control_statement;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		System.out.println("what is your age");
		Scanner r = new Scanner(System.in);
		int age = r.nextInt();
		r.close();
		int a = age;
		if (a >= 18) {
			System.out.println("Your eligibel to Vote");
		} else {
			System.out.println("your are not eligibel to Vote");

		}
	}
}
