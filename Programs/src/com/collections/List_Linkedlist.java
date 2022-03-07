package com.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_Linkedlist {
public static void main(String[] args) {
	List<Integer> a = new LinkedList<Integer>();
	a.add(10);
	a.add(13);
	a.add(25);
	a.add(22);
	a.add(23);
	int size = a.size();
	System.out.println(size);
	Object object = a.get(5);
	System.out.println(object);
	
	Object set = a.set(3, 777);
	System.out.println(set);
	System.out.println(a);
	Object remove = a.remove(1);
	System.out.println(remove);
	System.out.println(a);
	int indexOf = a.indexOf(23);
	System.out.println(indexOf);
	boolean contains = a.contains(13);
	System.out.println(contains);
//	a.clear();
//	System.out.println(a);
	List<Integer> b = new LinkedList<Integer>();
	b.add(4);
	b.add(3);
	b.add(9);
	b.add(2);
	b.addAll(a);
	System.out.println(b);
//	b.retainAll(a);
//	System.out.println(b);
//	a.removeAll(b);
//	System.out.println(a);
	boolean empty = a.isEmpty();
	System.out.println(empty);
	boolean equals = b.equals(a);
	System.out.println(equals);
	Collections.sort(b);
	System.out.println(b);
	
}
}
