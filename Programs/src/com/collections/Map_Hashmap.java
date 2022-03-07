
package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Hashmap {
public static void main(String[] args) {
	Map<Integer, String> a = new HashMap<Integer, String>();
	a.put(1, "Ibu");
	a.put(2, "Izaan");
	a.put(3, "Ifza");
	a.put(4, "Gibril");
	a.put(1, "Gibril");
	a.put(null, "raja");
	a.put(5, null);
	a.put(null, null);
	a.put(6, "raja");
	System.out.println(a);
	
	int size = a.size();
	System.out.println(size);
	
	// it print key's value 
	String string = a.get(2);
	System.out.println(string);
	
	// what are keys available in the KEY 
	//it will not allow Duplicate entry's 
	// it will override
	Set<Integer> keySet = a.keySet();
	System.out.println(keySet);
	
	// what are the values in the value
	//it will allow duplicate so it auto use as collections
	Collection<String> values = a.values();
	System.out.println(values);
	
	// if key is available or not?
	boolean containsKey = a.containsKey(1);
	System.out.println(containsKey);
	// if Value is available or not?
	boolean containsValue = a.containsValue("Izaan");
	System.out.println(containsValue);
	
	Set<Entry<Integer, String>> entrySet = a.entrySet();
	
	// it print every key and value pair value one by one
	//Separate values so we using Foreach loop

	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
	}
	//OR // we using Iterator
	Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
	while (iterator.hasNext()) {
		Entry<Integer, String> b = iterator.next();
		System.out.println(b);
		
	}
}
}
