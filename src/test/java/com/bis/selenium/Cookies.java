package com.bis.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cookies {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disbale-notification");
		//options.addArguments("--disable-popup-blocking");

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.instagram.com/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		//Total Cookies
		System.out.println("Total Cookies:"+cookies.size());
		
		//get values
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getValue());
		}
		
		//add new cookie
		Cookie cookieobj=new Cookie("newcookie","34567yh");
		driver.manage().addCookie(cookieobj);
		cookies= driver.manage().getCookies();
		System.out.println("adding cookie="+ cookies.size());
		
		//delete cookie
		driver.manage().deleteCookie(cookieobj);
		cookies= driver.manage().getCookies();
		System.out.println("Delte cookie="+ cookies.size());
		
		//delete all cookie
		driver.manage().deleteAllCookies();
		cookies= driver.manage().getCookies();
		System.out.println("Delte all cookie="+ cookies.size());
		
		driver.quit();
	
}
}