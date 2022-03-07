package com.Stringmanipulations;

public class String1 {
	public static void main(String[] args) {
		String a = "test engineer";
		String b = "TEST ENGINEER";
		String c = "selenium tester";
		int length = a.length();
		System.out.println(length);
		boolean equals = a.equals(b);
		System.out.println(equals);
		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);
		String upperCase = c.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = b.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = a.startsWith("test");
		System.out.println(startsWith);
		boolean endsWith = c.endsWith("tester");
		System.out.println(endsWith);
		boolean contains = c.contains("z");
		System.out.println(contains);
		int indexOf = a.indexOf("n");
		System.out.println(indexOf);
		int lastIndexOf = c.lastIndexOf("s");
		System.out.println(lastIndexOf);
		String substring = c.substring(1);
		System.out.println(substring);
		String substring2 = c.substring(4, 14);
		System.out.println(substring2);
		boolean empty = a.isEmpty();
		System.out.println(empty);
		String[] split = a.split("");
		for (String String : split) {
			System.out.println(String);}
		String trim = c.trim();
		System.out.println(trim);
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		int compareToIgnoreCase = a.compareToIgnoreCase(b);
		System.out.println(compareToIgnoreCase);
String concat = a.concat(c);
		System.out.println(concat);
	}
}
