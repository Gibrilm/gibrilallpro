package com.Two;

public class Second extends First {
	@Override
	public void team1() {
		super.team1();
	}

	@Override
	public void team2() {
		super.team2();
	}

	@Override
	public void team3() {
		super.team3();
	}

	private void team4() {
		System.out.println("Doc");
	}

	private void team5() {
		System.out.println("Triage");
	}

	private void team6() {
		System.out.println("Mil");
	}

	public static void main(String[] args) {
		Second z = new Second();
		z.team1();
		z.team2();
		z.team3();
		z.team4();
		z.team5();
		z.team6();

	}

}
