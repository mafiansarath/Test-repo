package com.bis.selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
//options.addArguments("--headless");
//options.addArguments("--disbale-notification");
//options.addArguments("--disable-popup-blocking");
options.setAcceptInsecureCerts(true);
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@id='multi']")).click();

Set<String> windowHandles = driver.getWindowHandles();
List<String> handlist= new ArrayList<>(windowHandles);

for (String window : handlist) {
	driver.switchTo().window(window).getCurrentUrl();
	if(window.equals("https://letcode.in/alert"))
		System.out.println("Valid-Window");
}



System.out.println("Page Title: " + driver.getTitle());

String windowHandle = driver.getWindowHandle();
System.out.println("window ID: " +driver.getWindowHandle());

	}
}
