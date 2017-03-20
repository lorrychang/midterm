package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section extends Semester{
	
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	public Section(String FirstName, String MiddleName, String LastName, Date DOB, com.cisc181.eNums.eMajor eMajor,
			String address, String phone_number, String email_address, UUID CourseID, String CourseName, int GradePoint,
			UUID SemesterID, Date StartDate, Date EndDate, int RoomID, UUID SectionID) {
		super(FirstName, MiddleName, LastName, DOB, eMajor, address, phone_number, email_address, CourseID, CourseName,
				GradePoint, SemesterID, StartDate, EndDate);

		this.SectionID = SectionID;
		this.RoomID = RoomID;
	}

	
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
