package com.aiite.pageexecution;

public class ClassA {
	
	static double calculateTax(double income, double investment) {
		double netIncome = income-investment;
		double tax = netIncome*0.15;
		return tax;
	}
	
	
	public static void main(String[] args) {
		double incomeAmount=1200.0;
		double investAmount=200.0;
		double taxAmount = calculateTax(incomeAmount, investAmount);
		System.out.println(taxAmount);
	}

}
