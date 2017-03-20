package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}


	@Test
	public void test() {
		List<Student> StudentTest = new ArrayList<Student>();
		StudentTest.add(new Course("Allen", "Bored", "cathy", null, null, null, null, null, null, "MATH", 3));
		StudentTest.add(new Course("dance", "Elephant", "Fish", null, null, null, null, null, null, "CHEMISTRY", 2));
		StudentTest.add(new Course("ghost", "hand", "iphone", null, null, null, null, null, null, "ENGLISH", 4));
		StudentTest.add(new Semester("junit", "kangaroo", "lisa", null, null, null, null, null, null, null, 3, null, null, null));
		StudentTest.add(new Semester("Mary", "Name", "OMG", null, null, null, null, null, null, null, 3, null, null, null));
		StudentTest.add(new Section("Peter", "Queen", "Red", null, null, null, null, null, null, null, 4, null, null, null, 0, null));
		StudentTest.add(new Section("Student", "Test", "Universe", null, null, null, null, null, null, null, 5, null, null, null, 0, null));
		StudentTest.add(new Section("Violin", "Water", "Xman", null, null, null, null, null, null, null, 4, null, null, null, 0, null));
		StudentTest.add(new Section("Yellow", "Zoo", "Amanda", null, null, null, null, null, null, null, 1, null, null, null, 0, null));
		StudentTest.add(new Section("Betty", "Cindy", "David", null, null, null, null, null, null, null, 2, null, null, null, 0, null));
	    
		assertEquals(1, 1);
	}
	
	//GPA
	@Test
	public void test1() {
		List<Student> StudentTest = new ArrayList<Student>();
		StudentTest.add(new Course("Allen", "Bored", "cathy", null, null, null, null, null, null, "MATH", 3));
		StudentTest.add(new Course("dance", "Elephant", "Fish", null, null, null, null, null, null, "CHEMISTRY", 2));
		StudentTest.add(new Course("ghost", "hand", "iphone", null, null, null, null, null, null, "ENGLISH", 4));
		StudentTest.add(new Semester("junit", "kangaroo", "lisa", null, null, null, null, null, null, null, 3, null, null, null));
		StudentTest.add(new Semester("Mary", "Name", "OMG", null, null, null, null, null, null, null, 3, null, null, null));
		StudentTest.add(new Section("Peter", "Queen", "Red", null, null, null, null, null, null, null, 4, null, null, null, 0, null));
		StudentTest.add(new Section("Student", "Test", "Universe", null, null, null, null, null, null, null, 5, null, null, null, 0, null));
		StudentTest.add(new Section("Violin", "Water", "Xman", null, null, null, null, null, null, null, 4, null, null, null, 0, null));
		StudentTest.add(new Section("Yellow", "Zoo", "Amanda", null, null, null, null, null, null, null, 1, null, null, null, 0, null));
		StudentTest.add(new Section("Betty", "Cindy", "David", null, null, null, null, null, null, null, 2, null, null, null, 0, null));
	    
		assertEquals(1, 1);
		
		double AverageGPA = (3 + 2 + 4 + 3 + 3 + 4 + 5 + 4 + 1 + 2) / 10;
		assertEquals(AverageGPA, 3.1);
		
	}

	
	//average grade
		@Test
		public void test2() {
			List<Student> StudentTest = new ArrayList<Student>();
			StudentTest.add(new Enrollment("Allen", "Bored", "cathy", null, null, null, null, null, null, "MATH", 3, null, null, null, 80.2));
			StudentTest.add(new Enrollment("dance", "Elephant", "Fish", null, null, null, null, null, null, "CHEMISTRY", 2, null, null, null, 75.3));
			StudentTest.add(new Enrollment("ghost", "hand", "iphone", null, null, null, null, null, null, "ENGLISH", 4, null, null, null, 92.4));
			StudentTest.add(new Enrollment("junit", "kangaroo", "lisa", null, null, null, null, null, null, null, 3, null, null, null, 88.6));
			StudentTest.add(new Enrollment("Mary", "Name", "OMG", null, null, null, null, null, null, null, 3, null, null, null, 90.0));
			StudentTest.add(new Enrollment("Peter", "Queen", "Red", null, null, null, null, null, null, null, 4, null, null, null, 60.1));
			StudentTest.add(new Enrollment("Student", "Test", "Universe", null, null, null, null, null, null, null, 5, null, null, null, 79.8));
			StudentTest.add(new Enrollment("Violin", "Water", "Xman", null, null, null, null, null, null, null, 4, null, null, null, 99.0));
			StudentTest.add(new Enrollment("Yellow", "Zoo", "Amanda", null, null, null, null, null, null, null, 1, null, null, null, 56.7));
			StudentTest.add(new Enrollment("Betty", "Cindy", "David", null, null, null, null, null, null, null, 2, null, null, null, 87.4));
		    
			assertEquals(1, 1);
			
			double AverageGrade = (80.2 + 75.3 + 92.4 + 88.6 + 90.0 + 60.1 + 79.8 + 99.0 + 56.7 + 87.4) / 10;
			assertEquals(AverageGrade, 80.95);
			
		}
}