package com.Array;

public class Array1 {
public static void main(String[] args) {
	int a[] = new int[5];
	a[0]=11;
	a[1]=12;
	a[2]=13;
	a[3]=14;
	a[4]=15;
	
int length = a.length;
System.out.println(length);
for (int i : a) {
	System.out.println(i);
}
}
}
