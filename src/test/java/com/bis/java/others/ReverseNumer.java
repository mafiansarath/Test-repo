package com.bis.java.others;

public class ReverseNumer {
	public static void main(String[] args) {
		int num = 1234567890;
		int rev = 0;
		System.out.println("input:1234567890");
//		oneline code
		 System.out.println("Reversed Number Using onelineCode :"+new StringBuilder(String.valueOf(num)).reverse());
//		Reversed Number Using StringBuffer
		StringBuffer name = new StringBuffer(String.valueOf(num));
		name.reverse();
		System.out.println("Reversed Number Using StringBuffer:" + name);

//		Reversed Number Using MathFormula:
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reversed Number Using MathsFormula:" + name);
       }
	}


