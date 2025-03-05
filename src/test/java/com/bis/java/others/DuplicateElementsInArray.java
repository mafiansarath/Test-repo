package com.bis.java.others;

import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateElementsInArray {
	@Test(enabled = false)
	void compare() {
		String animals[] = { "cat", "dog", "cow", "goat", "pig", "buffalo", "cow", "goat" };
		for (int i = 0; i < animals.length; i++) {
			for (int j = i + 1; j < animals.length; j++) {
				if (animals[i].equals(animals[j])) {
					System.out.println("duplicate Arrays: " + animals[i]);
				}
			}

		}

	}

	@Test(enabled = false)
	void collectionFramework() {
		String animals[] = { "cat", "dog", "cow", "goat", "pig", "buffalo", "cow", "goat" };
		Set<String> set = new HashSet<>();
		for (String animal : animals) {
			if (set.add(animal) == false) {
				System.out.println(animal);
			}

		}
	}

	@Test(enabled = false)
	
	void numbers() {
		int numbers[] = { 21, 12, 11, 07, 21 };
		Set<Integer> set = new HashSet<>();
		for (Integer number : numbers) {
			if (set.add(number) == false) {
				System.out.println("Duplicate Arrays Number:" + number);
			}
		}
	}

	@Test(enabled = false)
	void mapFramework() {
		String animals[] = { "cat", "dog", "cow", "goat", "pig", "buffalo", "cow", "goat" };
		Map<String, Integer> map = new HashMap<>();
		for (String ani : animals) {
			Integer count = map.get(ani);
			if (count == null) {
				map.put(ani, 1);
			} else {
				map.put(ani, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate key is: " + entry.getKey());
			}
		}

	}
	@Test(enabled = true)
	void deepSeek() {
		String animals[] = { "cat", "dog", "cow", "goat", "pig", "buffalo", "cow", "goat" };
		Map<String, Integer> map = new HashMap<>();
       
        // Map to store frequency of each value
        Map<Integer, Integer> valueFrequencyMap = new HashMap<>();

        // Populate the frequency map
        for (Integer value : map.values()) {
            valueFrequencyMap.put(value, valueFrequencyMap.getOrDefault(value, 0) + 1);
        }

        // Identify and print duplicate values
        System.out.println("Duplicate values in the map:");
        for (Map.Entry<Integer, Integer> entry : valueFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Value: " + entry.getKey() + " is duplicated.");
            }
        }	
	}

}
