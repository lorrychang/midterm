package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Enrollment extends Course {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public Enrollment(String FirstName, String MiddleName, String LastName, Date DOB, com.cisc181.eNums.eMajor eMajor,
			String address, String phone_number, String email_address, UUID CourseID, String CourseName,
			int GradePoint, UUID SectionID, UUID StudentID, UUID EnrollmentID, double Grade) {
		super(FirstName, MiddleName, LastName, DOB, eMajor, address, phone_number, email_address, CourseID, CourseName,
				GradePoint);

		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = EnrollmentID;
		this.Grade = Grade;
	}
	
	
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}

}
