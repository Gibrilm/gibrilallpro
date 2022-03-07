package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Arraylist {
public static void main(String[] args) {
	List<Object> g = new ArrayList<Object>();
	g.add(10);
	g.add(20);
	g.add(30);
	g.add(40);
	g.add(50);
	g.add("testing");
	g.add('M');
	g.add(79867565L);
	System.out.println(g);
	int size = g.size();
	System.out.println(size);
	Object object = g.get(2);
	System.out.println(object);
	Object set = g.set(2, 35);
	System.out.println(set);
	System.out.println(g);
	Object remove = g.remove(2);
	System.out.println(remove);
	System.out.println(g);
	int size2 = g.size();
	System.out.println(size2);
	int indexOf = g.indexOf(40);
	System.out.println(indexOf);
	boolean contains = g.contains(20);
	System.out.println(contains);
//	g.clear();
//	System.out.println(g);
	List<Integer> f = new ArrayList<Integer>();
	f.add(11);
	f.add(12);
	f.add(40);
	f.add(14);
	f.add(9);
	g.addAll(f);
	System.out.println(g);
//	f.retainAll(g);
//	System.out.println(f);
//	f.removeAll(g);
//	System.out.println(f);
	boolean empty = f.isEmpty();
	System.out.println(empty);
	boolean equals = g.equals(f);
	System.out.println(equals);
	Collections.sort(f);
	System.out.println(f);
}
}
