package com.bis.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Link in This Site: "+links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url != null && !url.isEmpty()) {
				try {
					URL linkurl = new URL(url);
					HttpURLConnection urlconnection = (HttpURLConnection) linkurl.openConnection();
					urlconnection.setRequestMethod("HEAD");
					urlconnection.connect();
					int responseCode = urlconnection.getResponseCode();
					if (responseCode >= 400) {
						System.out.println("The Corrupted Link is : " + linkurl + responseCode);
					} else {
						System.out.println("The Link is Valid: " + linkurl + " Response Code" +responseCode);
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		driver.quit();

	}
}
