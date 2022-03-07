package com.test;

public class Reverse_program {
public static void main(String[] args) {
	
	
	
	// 1. Using + string concatenation operator
	String str = "im arun kumar";
	String rev = "";
//	int length = str.length();
//	for (int i = length-1; i >=0; i--) {
//		rev=rev+str.charAt(i);
//	}
//	System.out.println(rev);
//	System.out.println(length);
	// 2. Using character array
	
	
	
	char a[]=str.toCharArray();
	//int len = a.length;
//	for (int i = len-1; i >=0; i--)
	for(int i=a.length-1;i>=0;i--){
	
		rev=rev+a[i];
	}
	System.out.println(rev);
	
	/*StringBuffer sb = new StringBuffer(str);// string buffer mutable class it have reverse (but string is immutable & it doesn't have reverse
	 * )
	StringBuffer reverse = sb.reverse(); 
	System.out.println(reverse);*/
System.out.println();
}
}

