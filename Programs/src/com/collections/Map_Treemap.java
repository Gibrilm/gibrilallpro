package com.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map_Treemap {
public static void main(String[] args) {
	Map<Integer, String> a = new TreeMap<Integer, String>();
	a.put(1, "Rajul");
	a.put(2, "Raj");
	a.put(3, "Priya");
	a.put(4, "Eby");
	a.put(1, "Ig");
	a.put(null, "Arun");
	a.put(5, "essy");
	a.put(null, null);
	System.out.println(a);
	int size = a.size();
	System.out.println(size);
//	String string = a.get(3);
//	System.out.println(string);
//	Set<Integer> keySet = a.keySet();
//	System.out.println(keySet);
//	Collection<String> values = a.values();
//	System.out.println(values);
//	boolean containsKey = a.containsKey(1);
//	System.out.println(containsKey);
//	boolean containsValue = a.containsValue("Ibu");
//	System.out.println(containsValue);
//	Set<Entry<Integer, String>> entrySet = a.entrySet();
//	for (Entry<Integer, String> entry : entrySet) {
//	System.out.println(entry);
}

}
