package com.bis.java.others;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountTheCharacter {

	@Test(enabled=false)
	void countOccurance() {
		String name = "sarathkumar";
		int counts = 0;
		int counta = 0;
		int countr = 0;
		int countt = 0;
		int counth = 0;
		int countk = 0;
		int countu = 0;
		int countm = 0;
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			sum++;

			if (charAt == 's') {
				counts++;
			} else if (charAt == 'a') {
				counta++;
			} else if (charAt == 'r') {
				countr++;
			} else if (charAt == 't') {
				countt++;
			} else if (charAt == 'h') {
				counth++;
			} else if (charAt == 'k') {
				countk++;
			} else if (charAt == 'u') {
				countu++;
			} else if (charAt == 'm') {
				countm++;
			}

		}
		System.out.println("s count=" + counts);
		System.out.println("a count=" + counta);
		System.out.println("r count=" + countr);
		System.out.println("t count=" + countt);
		System.out.println("h count=" + counth);
		System.out.println("k count=" + countk);
		System.out.println("u count=" + countu);
		System.out.println("m count=" + countm);
		System.out.println("TOtal count in name:" + sum);
	}

	@Test
	void countOccuranceUsingMap() {
		String name = "sarathkumar";
		Map<Character,Integer> map=new HashMap<>();
		for(char names:name.toCharArray()) {
			map.put(names, map.getOrDefault(names, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" Count="+entry.getValue());	
		}System.out.println("Total Count="+name.length());
	}
}
