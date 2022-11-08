package com.infinite.College;

import java.sql.Date;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CollegeDAO {
	
	SessionFactory sessionFactory;

	public String addcourse(Course Courseno ){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr = session.createCriteria(Course.class);
String cno = course();
Courseno.setCourseno(cno);
		java.util.Date date = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(Courseno.getStartdate().getTime());
		java.sql.Date sqlDate1 = new java.sql.Date(Courseno.getEnddate().getTime());
		session.save(Courseno);
		session.close();
		
		return "Course Added Sucessfully...";
	}

		private String course() {
		// TODO Auto-generated method stub
		return null;
	}

		public String addfeedback(Feedback Fid ){
			sessionFactory = SessionHelper.getConnection();
			Session session = sessionFactory.openSession(); 
			session.save(Fid);
			session.close();
			
			return "Feedback Completed Sucessfully...";



}
		}

