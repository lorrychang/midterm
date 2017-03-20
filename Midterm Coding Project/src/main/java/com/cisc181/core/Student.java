package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private UUID StudentID;
	eMajor eMajor;

    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    public Student(eMajor eMajor) {
    	this.eMajor = eMajor;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, com.cisc181.eNums.eMajor eMajor, 
			String address, String phone_number, String email_address)
	{
		super(FirstName, MiddleName, LastName, DOB, address, phone_number, email_address);
		this.StudentID = UUID.randomUUID();
		this.eMajor = eMajor;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}