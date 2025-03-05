package com.bis.java.arrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeTwoArrays {
	@Test(enabled=false)
	void mergeArray() {
		int num[] = { 21, 23, 19, 45, 43, 51 };
		int num1[] = { 34, 35, 20 };
		int merge[] = new int[num.length + num1.length];

		for (int i = 0; i < num.length; i++) {
			merge[i] = num[i];
		}
		for (int i = 0; i < num1.length; i++) {
			merge[num.length + i] = num1[i];
		}

		System.out.println("Merged Array : " + Arrays.toString(merge));

	}
	
	@Test(enabled=true)
	void mergeSortArray() {
		int num[] = { 21, 23, 19, 45, 43, 51 };
		int num1[] = { 34, 35, 20 };
		int merge[] = new int[num.length + num1.length];
		
		for (int i = 0; i < num.length; i++) {
			merge[i]=num[i];
			}
		for (int i = 0; i < num1.length; i++) {
			merge[num.length+i]=num1[i];
		}
		Arrays.sort(merge);
		System.out.println("Merge Sorted Array : "+ Arrays.toString(merge));
	}
}
