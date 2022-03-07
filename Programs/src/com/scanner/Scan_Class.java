package com.scanner;

import java.util.Scanner;

public class Scan_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		System.out.println(one);
		String two = sc.next();
		System.out.println(two);
		int three = sc.nextInt();
		System.out.println(three);
		long four = sc.nextLong();
		System.out.println(four);
		double five = sc.nextDouble();
		System.out.println(five);
		sc.close();
	}

}
