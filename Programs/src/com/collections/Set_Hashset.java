package com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_Hashset {
public static void main(String[] args) {
	Set<Integer> s =new HashSet<Integer>();
	s.add(2);
	s.add(4);
	s.add(88);
	s.add(99);
	s.add(55);
	s.add(77);
	int size = s.size();
	System.out.println(size);
	System.out.println(s);
//	s.get(2); 		not working
//	s.set(2); 		not working
//	s.indexof(88); 	not working
	s.remove(88);
	System.out.println(s);
	boolean contains = s.contains(4);
	System.out.println(contains);
//	s.clear();
//	System.out.println(s);
	Set<Integer> l = new HashSet<Integer>();
	l.add(3);
	l.add(77);
	l.add(65);
	l.add(56);
	s.addAll(l);
	System.out.println(s);
//	l.retainAll(s);
//	System.out.println(l);
	boolean empty = l.isEmpty();
	System.out.println(empty);
	boolean equals = l.equals(s);
	System.out.println(equals);
//	Collections.sort(l); 	not working
//	System.out.println(l);
	
}
}
