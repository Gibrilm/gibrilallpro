package com.test;

public class Swapping_2Numbers {
	
	
	public static void thirdvariable() {
	
	int mySal = 10;
	int yourSal=20;
	System.out.println("before swap"+"mysal:"+mySal +" yoursal"+yourSal);
	int temp=mySal;
	mySal=yourSal;
	yourSal=temp;
	System.out.println("afterswap"+"mysal:"+mySal +" yoursal"+yourSal);
	
	}
	public static void withoutThird() {
		int first = 12;
		int second=22;
		System.out.println("before swap"+"first:"+first +" second"+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("afterswap" +"first:"+first+"second:"+second);

	}
	public static void main(String[] args) {
		withoutThird();
		thirdvariable();
	}
}
