package com.constructor;

public class Building {
	public Building(String name) {
		System.out.println(name);
	}

	public Building(int age) {
		this("fana");
		System.out.println(age);
	}

	public Building(long length) {
		this(2021);
		System.out.println(length);
	}

	public Building(float width) {
		this(1228L);
		System.out.println(width);
	}

	public Building(char mode) {
		this(188.22F);
		System.out.println(mode);
	}
	public Building() {
		this('M');
System.out.println("Siass aqua");	
}

public static void main(String[] args) throws Throwable {
	Building t = new Building();
	t.finalize();
}

}
