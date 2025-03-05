package com.bis.java.others;

import java.util.Arrays;

public class EmailAddress {
public static void main(String[] args) {
	String name="Sarath.kumar.raja@gmail.com";
	String[] split = name.split("@");
	String edit=split[0].replace(".", "");
	String editted=edit+"@"+split[1];
	System.out.println(editted);

}
}
