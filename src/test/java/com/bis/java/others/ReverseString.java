package com.bis.java.others;

import org.testng.annotations.Test;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ReverseString {
	@Test(enabled = false)
	void normal() {
		String name = "sarathkumararaja";
		for (int i = name.length() - 1; i >= 0; i--) {
			char rev = name.charAt(i);
			System.out.print(rev);
		}
	}

	@Test(enabled = false)
	void arrayStrinBuffer() {
		String name[] = { "Angel", "Kumar", "Jain", "mohamad", "4356788", "$%^&**" };

		for (int i = 0; i < name.length; i++) {
			String a = name[i];
			StringBuffer rev = new StringBuffer(a).reverse();
			System.out.println(rev);
		}

	}

	@Test(enabled = true)
	void arrayWithoutStrinBuffer() {
		String name[] = { "Angel", "Kumar", "Jain", "mohamad", "4356788", "$%^&**" };
		for (int i = 0, j = name.length - 1; i < j; i++, j--) {
			String temp = name[i];
			name[i] = name[j];
			name[j] = temp;

		}
		for (String string : name) {
			System.out.println(string);
		}
	}
}
