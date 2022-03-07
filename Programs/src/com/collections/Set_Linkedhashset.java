package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Linkedhashset {
public static void main(String[] args) {
	Set<Integer> p = new LinkedHashSet<Integer>();
	p.add(8);
	p.add(5);
	p.add(4);
	p.add(2);
	int size = p.size();
	System.out.println(size);
//	p.getClass(2);			not working
//	p.set(2);				not working
//	p.indexof(2);			not working
	boolean contains = p.contains(4);
	System.out.println(contains);
	Set<Integer> o = new LinkedHashSet<Integer>();
	o.add(6);
	o.add(5);
	o.add(3);
	o.addAll(p);
	System.out.println(o);
	boolean equals = o.equals(p);
	System.out.println(equals);
//	Collections.sort(o);        not working
//	System.out.println(o);
	o.retainAll(p);
	System.out.println(o);
}
}
