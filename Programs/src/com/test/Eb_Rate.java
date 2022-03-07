package com.test;

import java.util.Scanner;

public class Eb_Rate {
public static void main(String[] args) {
	System.out.println("Enter your EB Reading");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
//	System.out.println(n);
	System.out.println("Electricity Bill is :");
	sc.close();
	if ( n > 1000) {
//		System.out.println("Electricity Bill is :" + n*10);
		System.out.println(n*10);
	}
	else if (n>500) {
		System.out.println(n*5);
		
	}else if (n>200) {
		System.out.println(n*2);
	} 
	else {
		System.out.println(n*1);
	}
	
}
}
