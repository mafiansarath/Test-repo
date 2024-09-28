package com.aiite.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static void browserLauch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void applyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static WebElement searchElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static String getProperty(String key) throws IOException {
		File file = new File("C:\\Users\\AzharudeenJaferali\\eclipse-workspace\\JuneBDDAutomation\\src\\test\\resources\\SiteDetails\\Details.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
	}
	
	public static void selectValueDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void elementRightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		actions.contextClick().perform();
	}

}
