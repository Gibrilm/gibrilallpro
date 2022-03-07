package com.Two2;

public class One extends Two {
	@Override
	public void test1() {
		super.test1();
	}

	@Override
	public void test2() {
		super.test2();
	}

	@Override
	public void test3() {
		super.test3();
	}

	private void test4() {
		System.out.println("Phy");
	}

	private void test5() {
		System.out.println("Bio");

	}

	private void test6() {
		System.out.println("Maths");

	}

	public static void main(String[] args) {
		One f = new One();
		f.test6();
		f.test1();
		f.test3();
		f.test4();
		f.test2();
		f.test5();

	}
}
