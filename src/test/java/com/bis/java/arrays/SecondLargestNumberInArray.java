package com.bis.java.arrays;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int num[]= {12,21,34,36,35};
		Arrays.sort(num);
		
		System.out.println("the second largest number in a Arrays is: "+num[num.length-2]);
	}
	     

}
