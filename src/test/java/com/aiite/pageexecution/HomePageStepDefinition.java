package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.Assert;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	@Given("Launch browser and load amazon url")
	public void launch_browser_and_load_amazon_url() throws IOException {
		BaseClass.browserLauch();
		BaseClass.loadUrl(BaseClass.getProperty("amazonUrl"));
	}

	@When("Search with mobile keyword in the homepage")
	public void search_with_mobile_keyword_in_the_homepage() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Mobile");
		hp.searchBtn.click();
	}

	@Then("Validate if the results are for mobile search")
	public void validate_if_the_results_are_for_mobile_search() throws InterruptedException {
	    // Validation
		Thread.sleep(2000);
		Assert.assertTrue(false);
		BaseClass.closeBrowser();
	}

	@When("Search with laptop keyword in the homepage")
	public void search_with_laptop_keyword_in_the_homepage() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Laptop");
		hp.searchBtn.click();
	}

	@Then("Validate if the results are for laptop search")
	public void validate_if_the_results_are_for_laptop_search() throws InterruptedException {
	    // Validation
		Thread.sleep(2000);
		Assert.assertTrue(true);
		BaseClass.closeBrowser();
	}


}
