package com.bis.java.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class MissingNumbers {

	public static void main(String[] args) {
		int num[] = { 20, 26, 24, 27, 21, 25 }; // Given numbers

		HashSet<Integer> set = new HashSet<>();
		for (Integer nums : num) {
			set.add(nums);
		}
		System.out.println("Missing Number");
		for (int i = 20; i <= 27; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");

			}
		}
	}

}
