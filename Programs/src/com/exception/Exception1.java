package com.exception;

import java.util.Scanner;

public class Exception1 {
public static void main(String[] args) {
//	Arithmetic exception 
//	int a= 10/0;
//	System.out.println(a);
	
// Null pointer exception	
//	String a = null;
//	int length = a.length();
//	System.out.println(length);

	// to give the input on integer as number not able to give string 
	//its shows input mismatch error
//	System.out.println("enter the value");
//	Scanner sc = new Scanner(System.in);
//	int nextInt = sc.nextInt();
//	System.out.println(nextInt);
//	sc.close();
	
	// array index out of bound exception
	int a[] = new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
//	a[3]=4; // extra input so getting error
	for (int i : a) {
		System.out.println(i);
	}
	
	// string index out of bound exception
	// it calculate index based if we give incorrect input search error
	String b = "java";
	char charAt = b.charAt(3);//error at 4 if we use 3 its works
	System.out.println(charAt);
	
	// Number format exception
	//String m = "55"; // string of value convert into numbers
	String m = "55java";
	System.out.println(m+45); // it print 5545
	int parseInt = Integer.parseInt(m);
	System.out.println(parseInt+45); // it print 100
	
}
}
