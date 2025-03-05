package com.bis.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	WebElement drop = driver.findElement(By.id("hi"));
	Select s=new Select(drop);
	String text = s.getFirstSelectedOption().getText();
	
	if(text.equals("hi")) {
		System.out.println("Verification Passed");
	} else {
		System.out.println("fail");
		
	}
	
}
}
