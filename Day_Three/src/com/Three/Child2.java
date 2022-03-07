package com.Three;

public class Child2 extends Child1 {
	@Override
	public void task1() {
		super.task1();
	}

	@Override
	public void task2() {
		super.task2();
	}

	@Override
	public void task3() {
		super.task3();
	}

	@Override
	public void task4() {
		super.task4();
	}

	@Override
	public void task5() {
		super.task5();
	}

	@Override
	public void task6() {
		super.task6();
	}
	private void task7() {
System.out.println("SDDC");
	}private void task8() {
System.out.println("DECA");
	}

	public static void main(String[] args) {
		Child2 r = new Child2();
		r.task1();
		r.task2();
		r.task3();
		r.task4();
		r.task5();
		r.task6();
		r.task7();
		r.task8();
	
	}
}
