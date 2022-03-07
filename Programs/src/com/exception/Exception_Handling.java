package com.exception;

public class Exception_Handling {

	
//	try {
//		int a = 10/0;
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	finally {
//	System.out.println("raj");
//	int a = 10;
//	int b = 5;
//	int c = a+b;
//	System.out.println(c);
//	}
	
	
//with out object need static method
private static void mark(int a) throws Exception {
	if (a>=35) {
		System.out.println("PASS");
	}else {
		throw new Exception("Fail");
	}
}private static void vote(int b) throws Exception {
if (b>=18) {
	System.out.println("Eligible");
}else {
	throw new Exception("Not Eligible");
}

}
public static void main(String[] args) throws Exception {
//	Exception_Handling r = new Exception_Handling();
//	r.mark(35);
//	r.vote(18);
	mark(12);
	vote(17);
}
}
