package com.bis.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class ReverseArray {
	@Test(enabled=true)
	void collectionReverse() {
		int num[] = {  20, 21, 22, 27, 24, 25 };
		List list = new ArrayList();
		for (Object nums : num) {
			list.add(nums);
		}
		Collections.reverse(list);
		System.out.println(list);
	}

	@Test(enabled=false)
	void normalMethod() {
		int num[] = { 21, 23, 19, 45, 43, 19 };
		for (int i = 0,j=num.length-1; i <j ; i++,j--) {
			 int temp=num[i];
			 num[i]=num[j];
			 num[j]=temp;
		}
System.out.println(Arrays.toString(num));		
	}
}
