package com.test;

public class Max_Min {
	public static void Maxvalue() {

		int num[] = { 29, 22, 34, 1, 3, 9 };

		int max = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {

				max = num[i];
			}
		}
		System.out.println(max);

	}

	public static void Minvalue() {
		int num[] = { 29, 22, 34, 1, 3, 9 };

		int min = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {

				min = num[i];
			}
		}
		System.out.println(min);

	}
	
	public static void secondmax() {
		int num[]= {22,333,334,442,149,4};
		int firstmax=0;
		int secondmax=0;
		for (int i = 0; i < num.length; i++) {
			if (firstmax<num[i]) {
				secondmax=firstmax;
				firstmax=num[i];
			}else if (secondmax<num[i]) {
				secondmax=num[i];
			}
		}
		System.out.println("firstMax "+firstmax+" second max "+secondmax);
	}

	public static void main(String[] args) {
		Maxvalue();
		Minvalue();
		secondmax();
	}
}
