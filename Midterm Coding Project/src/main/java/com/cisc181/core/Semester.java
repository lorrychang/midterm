package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester extends Course {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	

	public Semester(String FirstName, String MiddleName, String LastName, Date DOB, com.cisc181.eNums.eMajor eMajor,
			String address, String phone_number, String email_address, UUID CourseID, String CourseName,
			int GradePoint, UUID SemesterID, Date StartDate, Date EndDate) {
		super(FirstName, MiddleName, LastName, DOB, eMajor, address, phone_number, email_address, CourseID, CourseName,
				GradePoint);
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}


public UUID getSemesterID() {
	return SemesterID;
}


public void setSemesterID(UUID semesterID) {
	SemesterID = semesterID;
}


public Date getStartDate() {
	return StartDate;
}


public void setStartDate(Date startDate) {
	StartDate = startDate;
}


public Date getEndDate() {
	return EndDate;
}


public void setEndDate(Date endDate) {
	EndDate = endDate;
}
}