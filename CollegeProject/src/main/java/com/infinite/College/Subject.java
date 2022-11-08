package com.infinite.College;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject)")
public class Subject {
	
	@Id
	@Column(name="SubjectId")	
    private int SubjectId;
	
	@Column(name="Year")	
    private int Year;
	
	@Column(name="instructor")	
    private String instructor;
	
	@Column(name="Subject")	
    private String Subject;
	
	@Column(name="theory")	
    private int theory;
	
	@Column(name="practical")	
    private int practical;

	public Subject() {
	
	}

	public Subject(int subjectId, int year, String instructor, String subject, int theory, int practical) {
		SubjectId = subjectId;
		Year = year;
		this.instructor = instructor;
		Subject = subject;
		this.theory = theory;
		this.practical = practical;
	}

	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", Year=" + Year + ", instructor=" + instructor + ", Subject="
				+ Subject + ", theory=" + theory + ", practical=" + practical + "]";
	}

	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getTheory() {
		return theory;
	}

	public void setTheory(int theory) {
		this.theory = theory;
	}

	public int getPractical() {
		return practical;
	}

	public void setPractical(int practical) {
		this.practical = practical;
	}
	
 
}
