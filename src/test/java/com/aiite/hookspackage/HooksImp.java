package com.aiite.hookspackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImp {
	
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After Method");
	}

}
