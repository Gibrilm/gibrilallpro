package com.Interface;

public class Inter_Child implements Inter_Parent1, Inter_Parent2 {

	@Override
	public void size() {
		System.out.println("32");
	}

	@Override
	public void strike() {
		System.out.println("142.9");
	}

	@Override
	public void rating() {
		System.out.println("4star");
	}

	@Override
	public void player() {
		System.out.println("Infan");
	}

	@Override
	public void team() {
		System.out.println("India");
	}

	@Override
	public void number() {
		System.out.println("99");
	}

	public static void main(String[] args) {
		Inter_Child r = new Inter_Child();
		r.player();
		r.number();
		r.rating();
		r.team();
		r.size();
		r.strike();
	}
}
