package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Course extends Student{
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoint;

	
	public Course(String FirstName, String MiddleName, String LastName, Date DOB, com.cisc181.eNums.eMajor eMajor,
			String address, String phone_number, String email_address, UUID CourseID, String CourseName, int GradePoint) {
		super(FirstName, MiddleName, LastName, DOB, eMajor, address, phone_number, email_address);

		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoint = GradePoint;
		
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoint() {
		return GradePoint;
	}

	public void setGradePoint(int gradePoint) {
		GradePoint = gradePoint;
	}
	
}