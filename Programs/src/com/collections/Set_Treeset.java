package com.collections;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Set_Treeset {
public static void main(String[] args) {
	Set<Object> g = new TreeSet<Object>();
	g.add(2);
	g.add(10);
	g.add(20);
	g.add(30);
	System.out.println(g);
	int size = g.size();
	System.out.println(size);
//	Object object = g.get(2); 		not working
//	System.out.println(object);		not working
//	Object set = g.set(2, 35);		not working
//	System.out.println(set);		not working
	System.out.println(g);
	System.out.println(g);
	int size2 = g.size();
	System.out.println(size2);
//	int indexOf = g.indexOf(40);  		not working
//	System.out.println(indexOf);		not working
	boolean contains = g.contains(20);
	System.out.println(contains);
	Set<Object> f = new TreeSet<Object>();
	f.add(11);
	f.add(12);
	f.add(40);
	g.addAll(f);
	System.out.println(g);
	boolean empty = f.isEmpty();
	System.out.println(empty);
	boolean equals = g.equals(f);
	System.out.println(equals);
//	Collections.sort(f);		not working
//	System.out.println(f);		not working
}	
}
