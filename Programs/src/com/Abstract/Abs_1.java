package com.Abstract;

public class Abs_1 extends Abs_2 {

	@Override
	void Booking() {
		System.out.println("Regular folw");
	}

	@Override
	void finance() {
		System.out.println("QC added");
	}

	@Override
	void haz() {
		System.out.println("added alarm");
	}

	@Override
	public void recon() {
		super.recon();
	}

	@Override
	public void imports() {
		super.imports();
	}

	public static void main(String[] args) {
		Abs_1 r = new Abs_1();
		r.Booking();
		r.recon();
		r.finance();
		r.imports();
		r.haz();
	}

}
