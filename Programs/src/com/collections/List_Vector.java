package com.collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_Vector {
public static void main(String[] args) {
	List<Integer> m = new Vector<Integer>();
	m.add(9);
	m.add(7);
	m.add(5);
	m.add(3);
	m.add(1);
	int size = m.size();
	System.out.println(size);
	Integer integer = m.get(2);
	System.out.println(integer);
	Integer set = m.set(1, 5);
	System.out.println(set);
	System.out.println(m);
	int indexOf = m.indexOf(9);
	System.out.println(indexOf);
	boolean contains = m.contains(1);
	System.out.println(contains);
	
	List<Integer> s = new Vector<Integer>();
	s.add(19);
	s.add(29);
	s.add(39);
	s.add(49);
	s.addAll(m);
	System.out.println(s);
	boolean equals = s.equals(m);
	System.out.println(equals);
//	s.retainAll(m);
//	System.out.println(s);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	Collections.sort(s);
	System.out.println(s);
	
	
	
}
}
