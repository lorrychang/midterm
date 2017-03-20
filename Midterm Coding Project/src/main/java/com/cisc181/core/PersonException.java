package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{
	
	//check DOB

	public PersonException(){
		
	}
	
	public PersonException(String DOB){
		super(DOB);
		
	}
	

}
