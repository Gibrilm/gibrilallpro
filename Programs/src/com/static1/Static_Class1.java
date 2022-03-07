package com.static1;

public class Static_Class1 {
	static {
		System.out.println("Software Testing");
		System.out.println("done by");
	}
	static {
		String a = "Test";
		String b = "Engineer";
		String c = a + b;
		System.out.println(c);
	}

	private static void code() {
		System.out.println("Java");
	}

	static int z = 27;

	private void book() {
		System.out.println(z);
	}

	public static void main(String[] args) {
		Static_Class1 d = new Static_Class1();
		code();
		d.book();
	}

}
