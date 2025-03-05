package com.bis.others;

public class Imp implements Animals {

	@Override
	public void dog() {
		System.out.println("dog will bark");		
	}

	
public static void main(String[] args) {
	Imp i=new Imp();
	i.dog();
}


@Override
public void cat() {
	// TODO Auto-generated method stub
	
}
}
