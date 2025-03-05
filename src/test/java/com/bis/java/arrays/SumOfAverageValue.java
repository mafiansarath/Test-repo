package com.bis.java.arrays;

import java.util.Arrays;

public class SumOfAverageValue {
	public static void main(String[] args) {

		int num[] = { 21, 23, 19, 45, 43, 51 };
		int sum = 0;
		double average = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		average += sum / num.length;

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
}