package com.infinite.College;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback)")
public class Feedback {

	@Id
	@Column(name="Fid")
	private String Fid;
	
	@Column(name="Studentname")
	private String Studentname;
	
	@Column(name="instructor")
	private String instructor;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="FbValue")
	private String FbValue;

	public Feedback() {
		
	}

	public Feedback(String fid, String studentname, String instructor, String subject, String fbValue) {
		Fid = fid;
		Studentname = studentname;
		this.instructor = instructor;
		this.subject = subject;
		FbValue = fbValue;
	}

	@Override
	public String toString() {
		return "Feedback [Fid=" + Fid + ", Studentname=" + Studentname + ", instructor=" + instructor + ", subject="
				+ subject + ", FbValue=" + FbValue + "]";
	}

	public String getFid() {
		return Fid;
	}

	public void setFid(String fid) {
		Fid = fid;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFbValue() {
		return FbValue;
	}

	public void setFbValue(String fbValue) {
		FbValue = fbValue;
	}
	

}
