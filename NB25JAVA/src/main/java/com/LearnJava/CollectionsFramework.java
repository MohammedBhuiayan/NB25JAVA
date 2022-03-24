package com.LearnJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		int[] t = {10,50,70,30,50};
		ArrayList<Integer> g = new ArrayList<Integer>();
		
		//ClassName obj = new ClassName();
		
		int[] a = new int[5];
		a[0] = 10;
		System.out.println(a[0]);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Berry");
		list.add(null);
		list.add("Orange");
		list.add(null);
		list.add("Banana");
		System.out.println(list);
		//1. Allowing duplicate value 
		//2. Following insertion order
		//3. Allows NULL or multiple NULL
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Berry");
		ll.add(null);
		ll.add("Orange");
		ll.add(null);
		ll.add("Banana");
		System.out.println(ll);
		
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Berry");
		set.add(null);
		set.add("Orange");
		set.add(null);
		set.add("Banana");
		System.out.println(set);
		//1. No duplicate
		//2. No insertion order
		//3. Allows one null only
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Banana");
		lhs.add("Apple");
		lhs.add("Berry");
		lhs.add(null);
		lhs.add("Orange");
		lhs.add(null);
		lhs.add("Banana");
		System.out.println(lhs);
		//1. Follows insertion order
		//2. No Duplicate
		//3. One NULL value allowed
		
		TreeSet<String> ts = new TreeSet<String>();	
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Berry");
	//	ts.add(null);
		ts.add("Orange");	
		ts.add(null);
		ts.add("Banana");
		System.out.println(ts);
		//1. No Null allowed
		//2. No insertion order but ascending order
		//3. No duplicate
		
		Map<String, String> map = new HashMap<String, String>();		
		map.put("Banana", "6");
		map.put("Berry", null);
		map.put(null, "8");
		map.put("Orange", "6");
		map.put("Apple", "6");
		map.put(null, "9");
		map.put("Banana", null);
		System.out.println(map);
		System.out.println(map.get("Orange"));
		//1. No insertion order
		//2. No duplicate Key
		//3. Key, value pair
		//4. Only one NULL key is allowed
		//5. Allows duplicate value or multiple null value

	}

}
