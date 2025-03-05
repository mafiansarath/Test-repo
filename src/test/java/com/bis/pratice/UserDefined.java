package com.bis.pratice;

import java.util.HashMap;
import java.util.Map;

public class UserDefined {
	String Names;
	Integer Phonenumber;
	
	public UserDefined(String Names) {
		this.Names=Names;
	}
	public  UserDefined(Integer Phonenumber) {
		this.Phonenumber=Phonenumber;
	}
	
	public String toString() {
		return Names;
		
	}

	
}