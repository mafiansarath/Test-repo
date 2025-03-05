package com.bis.java.others;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class RemoveSpecailCharacter_junk {
		@Test
	void normal() {
		String sarath="rxtcyuiRDYTKJK@#$%^&*(4356778CGHVJ";
		sarath=sarath.replaceAll("[^a-zA-z]", "");
		System.out.println(sarath);
	}
		
//		remove special character in arrays
	@Test
	void array() {
		String name[] = { "Angel", "Kumar", "Jain", "mohamad", "4356788", "$%^&**" };

		for (int i = 0; i < name.length; i++) {
			String replaced = name[i].replaceAll("[a-zA-Z0-9]", "");

			System.out.print(replaced);

		}
	}

}
