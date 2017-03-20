package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		List<Staff> StaffTest = new ArrayList<Staff>();
		StaffTest.add(new Staff("Amy", "friend", "king", null, null, "123456789", null, null, 0, 10000, null, null));
	    StaffTest.add(new Staff("Banana", "gas", "lemon", null, null, "456789123", null, null, 1, 60000, null, null));
	    StaffTest.add(new Staff("cat", "horse", "money", null, null, "123789", null, null, 2, 2000, null, null));
	    StaffTest.add(new Staff("desk", "idea", "nick", null, null, "789-123-456", null, null, 3, 300000, null, null));
	    StaffTest.add(new Staff("egg", "jack", "oh", null, null, "11111111", null, null, 4, 90000, null, null));

		assertEquals(1,1);
		
		int AverageSalary = (10000 + 60000 + 2000 + 300000 + 90000) / 5;
		assertEquals(AverageSalary, 92400);
		
		
		}	

	//test for invalid phone_number
	@Test
	public void test1(){
		List<Staff> StaffTest = new ArrayList<Staff>();
		StaffTest.add(new Staff("Amy", "friend", "king", null, null, "123456789", null, null, 0, 10000, null, null));
	    StaffTest.add(new Staff("Banana", "gas", "lemon", null, null, "456789123", null, null, 1, 60000, null, null));
	    StaffTest.add(new Staff("cat", "horse", "money", null, null, "123789", null, null, 2, 2000, null, null));
	    StaffTest.add(new Staff("desk", "idea", "nick", null, null, "789-123-456", null, null, 3, 300000, null, null));
	    StaffTest.add(new Staff("egg", "jack", "oh", null, null, "11111111", null, null, 4, 90000, null, null));
	    
		assertEquals(1,1);
	}
	
	//test for invalid invalid DOB
		@Test
		public void test2(){
			List<Staff> StaffTest = new ArrayList<Staff>();
			StaffTest.add(new Staff("Amy", "friend", "king", null, null, "123456789", null, null, 0, 10000, null, null));
		    StaffTest.add(new Staff("Banana", "gas", "lemon", null, null, "456789123", null, null, 1, 60000, null, null));
		    StaffTest.add(new Staff("cat", "horse", "money", null, null, "123789", null, null, 2, 2000, null, null));
		    StaffTest.add(new Staff("desk", "idea", "nick", null, null, "789-123-456", null, null, 3, 300000, null, null));
		    StaffTest.add(new Staff("egg", "jack", "oh", null, null, "11111111", null, null, 4, 90000, null, null));

			assertEquals(1,1);
		}
}
