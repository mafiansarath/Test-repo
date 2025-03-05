package com.bis.pratice;

import java.util.Iterator;

public class Rough {
	public static void main(String[] args) {
		String name = "Sarath Kumar Raja";
		String[] split = name.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for (int i = 0; i < split.length; i++) {
			String rev=new StringBuffer (split[i]).reverse().toString();
			
			sb.append(rev).append(" ");
		}
	System.out.println(sb);
	}
	
}
