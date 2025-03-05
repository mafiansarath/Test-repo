package com.bis.pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.statements.ExpectException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;


public class Pratice {
//	static {String hi="hi";
//	System.out.println(hi);}
public static void main(String[] args) throws SecurityException, IOException, AWTException {
//	WebDriver driver =new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.amazon.in/");
//	WebElement element = driver.findElement(By.className("id"));
	
//	Waits
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
//	WebDriverWait wait =new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.elementToBeClickable(By.id("asdg")));
//	Wait<WebDriver> fw=new FluentWait(driver)
//			.withTimeout(java.time.Duration.ofSeconds(20))
//			.pollingEvery(java.time.Duration.ofSeconds(10));
//	fw.until(ExpectedConditions.elementToBeClickable(By.id("asa")));
//	--------------------------------------------------------------------------------
		
//	ScreenShots		
//	TakesScreenshot ts= (TakesScreenshot) driver;
//	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//	
//	File file=new File
//	("C:\\Users\\G O D\\eclipse-workspace\\ErrorMakesPerfect\\src\\test\\resources\\ss.png");
//    org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
//    driver.close();
	
//#Java Programs#
	
//Q1.	removing the . before @ in mail id
//String name= "Sarathkumar.raja@thebisteam.com";
//String[] split = name.split("@");
//String user=split[0].replace(".", "");
//System.out.println(user+"@"+split[1]);
//	--------------------------------------------------------

//Q2.	Count the Alphabets in the given string?
//			String str = "My name is RaghuRaman";
//			String replace = str.replace(" ", "");
//			System.out.println(replace);			
//			char[] charArray = replace.toCharArray();
//			int count=0;
//			for (char string : charArray) {
//				count++;
//			}
//			System.out.println(count);
//-------------------------------------------------------------
//Q3.	Code for Amstrong and Explain how it works?
//	int org=153;
//	int condi=org;
//	int arm=0;
//	do{int rem=org%10;
//	arm=arm+(rem*rem*rem);
//	org=org/10;}
//	while(org!=0);
//	if (arm==condi) {
//			System.out.println("200-success");
//		}
//	------------------------------------------------------------
	
//Q4.  Count the alphabets
//	String nam="aaaaaaadffffffg444444^%&44444@#####5676#####"
//		      String name = "aaaaaaadffffffg444444^%&44444@#####5676#####";
//		      int count=0;
//		      for (int i = 0; i < name.length(); i++) {
//		    	    char c= name.charAt(i);
//		    	  if(Character.isAlphabetic(c)) {
//		    		count++;
//		    	  }
//		      }System.out.println(count);
//------------------------------------------------------------------
//Q5. Write a program for swapping two variable without using 3rd variable
	
//	int a= 10;
//	int b=5;
//	a=a-b;
//	b=a+b;
//	System.out.println(a);
//	System.out.println(b);
//-------------------------------------------------------------------
//Q6. Program for reverse a string     
		      String name="AngelKumar";
		      String rev="";
		      for (int i = name.length()-1 ; i >=0 ; i--) {
				char charAt = name.charAt(i);
//				rev+=charAt;
				System.out.print(charAt);

		      }
//		     System.out.println(charAt);
}


}


	
	
	
	
	


