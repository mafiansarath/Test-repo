package com.bis.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		// options.addArguments("--disbale-notification");
		// options.addArguments("--disable-popup-blocking");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//button[@id='multi']")).click();
		String parentwindow = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();
//	List<String> handlist= new ArrayList<>(windowHandles);

		for (String window : windowHandles) {
			String currentUrl = driver.getCurrentUrl();
			if (!window.equals(parentwindow))

				driver.switchTo().window(window);
			if (currentUrl.equals("https://letcode.in/alert"))
				System.out.println("Valid-Window");
			else {
				System.out.println("InValid-Window");
			}
		}

		System.out.println("Page Title: " + driver.getTitle());

		System.out.println("window ID: " + driver.getWindowHandle());

	}
}
