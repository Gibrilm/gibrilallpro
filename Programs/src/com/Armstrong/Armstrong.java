package com.Armstrong;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Armstrong number in between 0 to 500");
		Scanner m = new Scanner(System.in);
		int arm = m.nextInt();
		m.close();

		for (int i = 1; i <= arm; i++) {
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
