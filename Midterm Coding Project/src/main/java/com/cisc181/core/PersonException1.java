package com.cisc181.core;

public class PersonException1 extends Exception {

	//check phone_number
	public PersonException1(){
		
	}
	
	public PersonException1(String phone_number){
		super(phone_number);
		
	}

}
