package com.bis.java.others;

import java.util.Iterator;

public class StarProgram {
	public static void main(String[] args) {

	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=(5-i); j++) {
			System.out.print(" ");
		}for (int k = 1; k <=i; k++) {
			System.out.print("a"+"*");
		}
		System.out.println();
	}
	
	}

}
