package com.bis.java.others;

import java.util.HashSet;
import java.util.Set;

import io.cucumber.java.an.E;

public class Vowel {
	public static void main(String[] args) {
		String name = "map";
		String original = name;
		int vowels = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
			vowels++;
			}

		}
		System.out.println("vowels Count: "+vowels);
	
	}
}