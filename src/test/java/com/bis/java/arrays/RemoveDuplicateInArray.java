package com.bis.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int num[] = { 21, 12, 21, 34, 12, 56 };
		Set<Integer> set = new HashSet<>();
		for (Integer nums : num) {
			if (!set.add(nums)) {
				System.out.println("Duplicate Values :" + nums);
			}
		}
		System.out.print("Duplicates Removed Values" + set);
	}
}
