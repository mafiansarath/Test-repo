package com.bis.java.arrays;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.K;

public class Rough {
public static void main(String[] args) {
	

	String name="SarathKumar";
Map<Character,Integer> map=new HashMap<Character, Integer>();

for (Character names : name.toCharArray()) {
	map.put(names, map.getOrDefault(names, 0)+1);}
	
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		Character key = entry.getKey();
		Integer val = entry.getValue();
		System.out.println("Lettes: "+key+ " Times: "+val);	
	}
}
}

