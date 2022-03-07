package com.test;

public class Duplicate_Arrayusing_2_Array {
public static void main(String[] args) {
	
	int num1[]= {12,13,14,15,16};
	int num2[]= {14,15,16,17,18};
	
	for (int i = 0; i < num1.length; i++) {
	
		for (int j = 0; j < num2.length; j++) {
		
			if (num1[i]==num2[j]) {
				System.out.println(num1[i]);
			break;
			}
			
		}
		
	}


}
}
