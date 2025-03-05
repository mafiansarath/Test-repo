package com.bis.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumAndMinimumNumber {
	public static void main(String[] args) {
		int num[] = { 21, 23, 19, 45, 43, 51 };
		int max= num[0];
		int min= num[0];
		for (int i = 1; i < num.length; i++) {
			if(num[i]>max) {
				num[i]=max;
			}else if(num[i]<min) {
				num[i]=min;
			}
		}
		
		System.out.println("Max Num:" + max);
		System.out.println("Min Num:" + min);
	}
}
