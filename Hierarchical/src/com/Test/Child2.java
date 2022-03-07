package com.Test;

public class Child2 extends Parent {
	@Override
	public void msd() {
		super.msd();
	}

	@Override
	public void dk() {
		super.dk();
	}

	@Override
	public void kl() {
		super.kl();
	}

	public static void main(String[] args) {
		Child2 r = new Child2();
		r.msd();
		r.kl();
		r.dk();
	}
}
