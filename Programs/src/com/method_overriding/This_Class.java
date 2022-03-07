package com.method_overriding;

public class This_Class {
	public void team(String name) {
		System.out.println(name);
	}

	public void team(int size) {
		System.out.println(size);
		this.team("Ifza");
	}

	public void team(char gender) {
		System.out.println(gender);
		this.team(32);
	}

	public void team(float value) {
		System.out.println(value);
		this.team('M');
	}

	public void team(long mob) {
		System.out.println(mob);
		this.team(177.22F);
	}

	public static void main(String[] args) {
		This_Class g = new This_Class();
		g.team(987654321L);
	}
}
