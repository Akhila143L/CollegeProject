package com.infinite.College;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course)")
public class Course {
	
	@Id
	@Column(name="Courseno")
	private String Courseno;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="startdate")
	private Date startdate;

	@Column(name="enddate")
	private Date enddate;
	
	@Column(name="HOD")
	private String HOD;

	public Course() {
		
	}

	public Course(String courseno, int duration, Date startdate, Date enddate, String hOD) {
		Courseno = courseno;
		this.duration = duration;
		this.startdate = startdate;
		this.enddate = enddate;
		HOD = hOD;
	}

	@Override
	public String toString() {
		return "Course [Courseno=" + Courseno + ", duration=" + duration + ", startdate=" + startdate + ", enddate="
				+ enddate + ", HOD=" + HOD + "]";
	}

	public String getCourseno() {
		return Courseno;
	}

	public void setCourseno(String courseno) {
		Courseno = courseno;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getHOD() {
		return HOD;
	}

	public void setHOD(String hOD) {
		HOD = hOD;
	}
	
}
