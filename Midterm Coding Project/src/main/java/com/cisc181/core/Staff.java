package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 private eTitle eTitle;

	    public void seteTitle(eTitle etitle){
	        this.eTitle = etitle;
	    }
	    public eTitle geteTitle(){
	        return this.eTitle;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle eTitle) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.eTitle = eTitle;
	}

}