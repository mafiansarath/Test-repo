package com.bis.java.others;

import org.testng.annotations.Test;

public class FactorialNumbers {
	static long fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * (fact(n - 1));
	}
	public static void main(String[] args) {
		System.out.println("factorial number:"+fact(9) );
	}

}
