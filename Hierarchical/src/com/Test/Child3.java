package com.Test;

public class Child3 extends Parent {
	@Override
	public void jasprit() {
		super.jasprit();
	}

	@Override
	public void ms() {
		super.ms();
	}

	@Override
	public void sanju() {
		super.sanju();
	}

	public static void main(String[] args) {
		Child3 r = new Child3();
		r.jasprit();
		r.ms();
		r.sanju();
	}
}
