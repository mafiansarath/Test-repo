package com.bis.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class FindAElemetInArray {

	@Test(enabled = false)
	void findele() {
		int num[] = { 21, 12, 21, 34, 12, 56 };
		System.out.println("enter the input");
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();

		Set<Integer> set = new HashSet<Integer>();
		for (int nums : num) {
			set.add(nums);
		}
		if (set.contains(target)) {
			System.out.println("Target Values is " + target + " found in a the given Array");
		} else {
			System.out.println("The given Number " + target + " is not FOund in a Array");
		}
	}

//		Find Element in a Sorted Array
	@Test
	void findEleArray() {
		int num[] = { 21, 34, 12, 56, 21, 12 };
		Arrays.sort(num);
		int target = 30;
		System.out.println(Arrays.toString(num));

		Set<Integer> set = new HashSet<>();
		for (Integer nums : num) {
			set.add(nums);
		}
		if (set.contains(target)) {
			System.out.println("Target Values is " + target + " found in a the given Array");
		} else {
			System.out.println("The given Number " + target + " is not Found in a Array");
		}
	}
}
