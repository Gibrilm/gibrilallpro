package com.test;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_Array {
public static void main(String[] args) {
	int arraynum[]= {11,11,2,2,3,3,4,5,5,6,7,7,9};
	int c=0;
	Set<Integer> dupnum=new HashSet<Integer>();
	for (Integer num : arraynum) {
		if (!dupnum.add(num)) {
			System.out.println("dupli num are: "+num);
			c++;	
		}
	}System.out.println(c);
}
}
