package com.control_statement;

public class Fibonacci_Series {
public static void main(String[] args) {
	int a = 3, b=2,c;
	for (int i = 1; i <=12; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}
