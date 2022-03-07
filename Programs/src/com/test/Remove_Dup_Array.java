package com.test;

import java.util.Arrays;

public class Remove_Dup_Array {
public static void main(String[] args) {
	int num[]= {1,2,3,4,5,5,6,6,7,9,8,8};
//	System.out.println("ogr array");
//	for (int i : num) {
//		System.out.println(i);
//	}
//	
	int num1[]=Arrays.stream(num).distinct().toArray();
	System.out.println("after");
	for (int j : num1) {
	System.out.println(j);
	}
	
}
}
