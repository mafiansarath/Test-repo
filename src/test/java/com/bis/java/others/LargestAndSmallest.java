package com.bis.java.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class LargestAndSmallest {
	@Test(enabled = false)
	void largest() {
		int num[] = { 2, 5, 6, 32, 21, 45, 50 };
		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			int numbers = num[i];
			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("GivenNumber" + Arrays.toString(num));
		System.out.println("largestNumber:" + largest);
		System.out.println("smallestNumber" + smallest);
	}

	@Test
	void large() {
		int num[] = { 21, 12, 21, 34, 45 };
		List<Integer> list = new ArrayList<>();
		for (Integer nums : num) {
			list.add(nums);

		}
		System.out.println("largestNumber:" + Collections.max(list));
		System.out.println("largestNumber:" + Collections.min(list));
	}
}
