package com.bis.pratice;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
	Map<String, Integer> phone=new HashMap<String, Integer>();
	phone.put("Sarath", 233762398);

	        phone.put("Sarath", 233762398);
	        phone.put("Nivetha", 987654321);
	        phone.put("Arun", 876543210);
	        phone.put("Priya", 765432109);
	        phone.put("Rahul", 654321098);
	        phone.put("Sneha", 543210987);
	        phone.put("Vignesh", 432109876);
	        phone.put("Divya", 321098765);
	        phone.put("Karthik", 210987654);
	        phone.put("Ananya", 109876543);
	        
	        
			for ( Map.Entry<String, Integer> ph:phone.entrySet()) {
				System.out.println(ph.getKey()+"="+ph.getValue());
				
			}
	        
	        
	        
			}

	       


}

