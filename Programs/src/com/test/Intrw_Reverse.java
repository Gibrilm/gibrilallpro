package com.test;

public class Intrw_Reverse {
	
	public static String a="Welcome to Disney Land";
	public static String r = "";
	
	//i/o/p : Welcome to Disney Land || dnaL yensiD ot emocleW

	public static void usingStringBuffer() {
		
		StringBuffer sb= new StringBuffer(a);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);		
	}
	
	//i/o/p : Welcome to Disney Land || dnaL yensiD ot emocleW

	public static void usingStringBuff1() {

		StringBuffer sb = new StringBuffer();
		sb.append(a);
		System.out.println(sb.reverse());
	}
	
	//i/o/p : Welcome to Disney Land || dnaL yensiD ot emocleW

	public static void usingCharArray() {
			
		char[] charArray = a.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			r=r+charArray[i];	
		}System.out.println(r);
	}
	
	//i/o/p : Welcome to Disney Land || dnaL yensiD ot emocleW

	public static void usingconcad() {
		int length = a.length();
		for (int i = length-1; i>=0; i--) {
			r=r+a.charAt(i);
		}System.out.println(r);
	}
	
	// i/o/p : Welcome to Disney Land || emocleW ot yensiD dnaL 

	public static void eachWordreverse() {
		
		String[] split = a.split(" ");
		for (String b : split) {
			String c="";
			for (int i = b.length()-1; i >=0; i--) {
				c=c+b.charAt(i);
			}r=r+c+" ";
			
		}System.out.println("Original word :"+a);
		System.out.println("Changed word :"+r);
	}
	
	
	//i/o/p: 987654321 || 123456789
	
	public static void reversenum() {
		int a,i=0,j=0;
		int num = 987654321;
		a=num;

		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}System.out.println("reverse numb is " +j);
	}
	
	//i/o/p: Welcome to Disney Land || Land Disney to Welcome 

	public static void ReverseWordInaSentance() {
	String[] temp = a.split(" ");
	System.out.println(temp.length);
//	System.out.println(temp[0]); // check
	for (int i = temp.length-1; i >=0; i--) {
		r=r+temp[i]+" ";
	}
		System.out.println(r);
	}
	
	
	public static void main(String[] args) {		
		usingStringBuffer();
//		usingStringBuff1();
//		usingCharArray();
//		usingconcad();
//		eachWordreverse();
//		reversenum();
//		ReverseWordInaSentance();
	}

}
