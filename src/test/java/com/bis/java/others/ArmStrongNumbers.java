package com.bis.java.others;

public class ArmStrongNumbers {

	public static void main(String[] args) {

		int num = 135;
		int original = num;
		int sum = 0;
		int digits = 0;
		for (int i = num; i > 0; i /= 10) {
			digits++;
		}
		for (int i = num; i > 0; i /= 10) {
			int digit = i % 10;
			sum += Math.pow(digit, digits);
		}
		if(sum==original) {
			System.out.println("Number "+original+" is Armstrong");
		}else {			System.out.println("Number "+original+" is Not a Armstrong");}

	}

}
