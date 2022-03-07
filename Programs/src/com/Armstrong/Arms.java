package com.Armstrong;

import java.util.Scanner;

public class Arms {
	public static void main(String[] args) {
		System.out.println("Find the Armstrong numbers upto");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Armstrong numbers are");
		for (int i = 1; i <= n; i++) {
			int a = i, b, c = 0;

			while (a > 0) {
				b = a % 10;
				c = c + (b * b * b);
				a = a / 10;
				
		}
			if (i == c)
				System.out.println(i);
			
		}
	}
}
