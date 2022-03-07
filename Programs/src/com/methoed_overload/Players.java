package com.methoed_overload;

public class Players {
	private void team(String name) {
		System.out.println(name);
	}

	private void team(int size) {
		System.out.println(size);
	}

	private void team(char gender) {
		System.out.println(gender);
	}

	private void team(float rating) {
		System.out.println(rating);
	}

	private void team(long count) {
		System.out.println(count);
	}

	public static void main(String[] args) {
		Players s = new Players();
		s.team("India");
		s.team(11);
		s.team('M');
		s.team(93.75F);
		s.team(15L);
	}
}
