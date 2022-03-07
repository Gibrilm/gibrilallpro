package com.method_overriding;

public class Class2 extends Class1 {

	@Override
	public void team(char gender) {
		super.team(gender);
	}

	@Override
	public void team(float value) {
		super.team(value);
	}

	@Override
	public void team(int size) {
		super.team(size);
	}

	@Override
	public void team(long mob) {
		super.team(mob);
	}

	@Override
	public void team(String name) {
		super.team(name);
	}
	private void team(double d) {
System.out.println(d);
	}
	public static void main(String[] args) {
		Class2 r = new Class2();
		r.team("Favaz");
		r.team('M');
		r.team(32);
		r.team(989878782L);
		r.team(112.25F);
		r.team(42/23D);
	}
}
