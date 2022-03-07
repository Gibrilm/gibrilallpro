package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Repeat_Program {
	public static void main(String[] args) {
		String s = "For the people by the people of the people";
		System.out.println(s);
		String[] split = s.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : split) {
			System.out.println(str);
			if (map.containsKey(str)) {
				Integer i = map.get(str);
				map.put(str, i + 1);
			} else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
// print greater than 1 values
		Set<Entry<String, Integer>> entrySet = map.entrySet();
// iterate
		//	System.out.println(entrySet);
		
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}

		}
	}
}

