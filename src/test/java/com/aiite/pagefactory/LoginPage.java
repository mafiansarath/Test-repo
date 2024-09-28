package com.aiite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='pageFooterChildren']//a")
	public List<WebElement> links;
	
	@FindBy(id="react-burger-menu-btn")
	public WebElement menuBtn;
	
	@FindBy(id="user_dropdown")
	public WebElement userDD;
	
	
	@FindBy(xpath="//a[@rel='async']")
	public WebElement createNewAccBtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstNameTxt;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastNameTxt;

}
