package com.bis.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Rough {
	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String loc = "Avadi";
		driver.findElement(By.id("src")).sendKeys("ava");
		List<WebElement> elements = driver.findElements(By.cssSelector(".sc-dnqmqq.dZhbJF"));
		for (WebElement ddops : elements) {
			String dtext = ddops.getText();
		if(dtext.contains(loc)) {
			ddops.click();
		}
	}
//driver.close();
}}
