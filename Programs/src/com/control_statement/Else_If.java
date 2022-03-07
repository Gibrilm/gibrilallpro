package com.control_statement;

import java.util.Scanner;

public class Else_If {
	
	public static void main(String[] args) {
		System.out.println("Age limt to apply GOVT exams");
		Scanner r = new Scanner(System.in);
		int age = r.nextInt();
		r.close();
		int a = age;
		
		if (a>=20 && a<=27) {
			System.out.println("You are eligible to apply");
			
		}else if (a<20) {
			System.out.println("You are under age");
		} else {
System.out.println("you are not eligible to apply");
		}
	}

}
