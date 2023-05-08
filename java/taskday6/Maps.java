package taskday6;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("John", 25);
		hashMap.put("Sarah", 30);
		hashMap.put("Alice", 20);
		System.out.println("HashMap : " + hashMap);
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("John", 25);
		treeMap.put("Sarah", 30);
		treeMap.put("Alice", 20);
		System.out.println("TreeMap : " + treeMap);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("John", 25);
		linkedHashMap.put("Sarah", 30);
		linkedHashMap.put("Alice", 20);
		System.out.println("LinkedHashMap : " + linkedHashMap);

		// Accessing elements of the HashMap
		System.out.println("HashMap:");
		for (String key : hashMap.keySet()) {
			System.out.println(key + ": " + hashMap.get(key));
		}

		// Accessing elements of the TreeMap
		System.out.println("\nTreeMap:");
		for (String key : treeMap.keySet()) {
			System.out.println(key + ": " + treeMap.get(key));
		}

		// Accessing elements of the LinkedHashMap
		System.out.println("\nLinkedHashMap:");
		for (String key : linkedHashMap.keySet()) {
			System.out.println(key + ": " + linkedHashMap.get(key));
		}
	}

}
