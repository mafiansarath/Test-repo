package com.bis.java.arrays;

import java.util.Arrays;

public class CopyAndEquals{
	public static void main(String[] args) {

		int num[] = { 21, 23, 19, 45, 43, 51 };
		int num1[] = { 21, 23, 19, 20 };
		int num2[] = { 21, 25, 19, 45, 43, 51 };
		int num3[] = { 21, 23, 19, 45, 43, 51 };
		int[] copy = new int[num.length];
		copy = num.clone();
		System.out.println(Arrays.toString(copy));

//Equals:
		System.out.println("num==num1:" + Arrays.equals(num, num1));
		System.out.println("num1==num2:" + Arrays.equals(num1, num2));
		System.out.println("num2==num3:" + Arrays.equals(num2, num3));
		System.out.println("num1==num3:" + Arrays.equals(num1, num3));

	}

}
