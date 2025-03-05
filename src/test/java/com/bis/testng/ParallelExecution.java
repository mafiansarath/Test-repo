package com.bis.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	@Parameters("browser")
	public void google(String browser) {
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().fullscreen();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("HI");

			System.out.println("URL : " + driver.getCurrentUrl() + " Title:" + driver.getTitle());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.close();
		}
	}

	@Test
	@Parameters("browser")
	public void googles(String browser) {
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().fullscreen();
			driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));
			element.sendKeys("submit");
			element.submit();
			System.out.println("URL : " + driver.getCurrentUrl() + " Title:" + driver.getTitle());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.close();
		}
	}

	@Test
	@Parameters("browser")
	public void youtube(String browser) {
		if (browser.equalsIgnoreCase("edge")) {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().fullscreen();
			driver.get("https://www.youtube.com/");

			System.out.println("URL : " + driver.getCurrentUrl() + " Title:" + driver.getTitle());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else {
			System.out.println("no broser selected");
		}
	}
}
