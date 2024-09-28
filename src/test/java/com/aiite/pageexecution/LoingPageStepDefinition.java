package com.aiite.pageexecution;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoingPageStepDefinition {

	@Given("Launch browser and load the url")
	public void launch_browser_and_load_the_url() throws IOException {
		BaseClass.browserLauch();
		BaseClass.loadUrl(BaseClass.getProperty("SiteUrl"));
	}

	@When("Provide valid username and password then hit login")
	public void provide_valid_username_and_password_then_hit_login() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(BaseClass.getProperty("UserName"));
		lp.passWord.sendKeys(BaseClass.getProperty("Password"));
		Thread.sleep(2000);
		lp.loginBtn.click();
	}

	@Then("Validate if the user logged in and close browser")
	public void validate_if_the_user_logged_in_and_close_browser() throws InterruptedException {
		// Validation
		Thread.sleep(2000);
//		Assert.assertTrue(lp.menuBtn.isDisplayed());
		BaseClass.closeBrowser();
	}
	
	@When("Provide invalid username and password then hit login")
	public void provide_invalid_username_and_password_then_hit_login() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys("UserName");
		lp.passWord.sendKeys("Password");
		Thread.sleep(2000);
		lp.loginBtn.click();
	}

	@Then("Validate if the user is not logged in and close browser")
	public void validate_if_the_user_is_not_logged_in_and_close_browser() throws InterruptedException {
		Thread.sleep(2000);
		BaseClass.closeBrowser();
	}
	
	@When("Provide valid {string} and {string} then hit login")
	public void provide_valid_and_then_hit_login(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys(username);
		lp.passWord.sendKeys(password);
		Thread.sleep(2000);
		lp.loginBtn.click();
	}
	
	@Given("Launch browser and load facebook url")
	public void launch_browser_and_load_facebook_url() {
		BaseClass.browserLauch();
		BaseClass.loadUrl("https://www.facebook.com/");
	}
	
	@Then("Validate if the account created and close browser")
	public void validate_if_the_account_created_and_close_browser() throws InterruptedException {
	    // 
		Thread.sleep(2000);
		BaseClass.closeBrowser();
	}
	
	@When("Provide valid account information and create")
	public void provide_valid_account_information_and_create(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
//		List<String> values = dataTable.asList();	//receiving input as List
//		System.out.println(values);
//		System.out.println(values.get(0));
//		System.out.println(values.get(1));
//		System.out.println(values.get(2));
//		
//		LoginPage lp = new LoginPage();
//		lp.createNewAccBtn.click();
//		Thread.sleep(2000);
//		lp.firstNameTxt.sendKeys(values.get(0));
//		lp.lastNameTxt.sendKeys(values.get(1));
		
		
//		List<List<String>> listOfAddress = dataTable.asLists();		//receiving input as List of List
//		List<String> presentAddress = listOfAddress.get(0);
//		System.out.println(presentAddress.get(0));
//		System.out.println(presentAddress.get(1));
//		System.out.println(presentAddress.get(2));
//		
//		List<String> permanentAddress = listOfAddress.get(1);
//		System.out.println(permanentAddress.get(0));
//		System.out.println(permanentAddress.get(1));
//		System.out.println(permanentAddress.get(2));
//		for (String line : permanentAddress) {
//			System.out.println(line);
//		}
		
		List<Map<String, String>> studentsDetail = dataTable.asMaps();	//receiving input as List of Map
		for(int i=0; i<studentsDetail.size();i++) {
			if(i==1) {
				continue;
			}
			Map<String, String> studentInfo = studentsDetail.get(i);
			
			System.out.println(studentInfo);
			Set<Entry<String, String>> info = studentInfo.entrySet();
			for (Entry<String, String> entry : info) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
		}
		
		
		
	}

}
