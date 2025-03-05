package com.bis.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("HI");

		System.out.println("URL : " + driver.getCurrentUrl() + " Title:" +driver.getTitle());

		driver.close();
	}
}
