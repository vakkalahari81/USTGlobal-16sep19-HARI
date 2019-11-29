package com.ustglobal.jpawithibernatepp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;


public class TestManyToMany {
	
	public static void main(String[] args) {
		
		
		Course course = new Course();
		course.setCid(10);
		course.setCname("java");
		
		Course course1 = new Course();
		course1.setCid(11);
		course1.setCname("python");
		
	    ArrayList<Course>al = new ArrayList<Course>();
	    al.add(course);
	    al.add(course1);
	    
		Student student = new Student();
		
				student.setSid(20);
				student.setSname("Rahul");
				student.setCourses(al);
				
				
		 EntityManager entityManager = null;
		 EntityTransaction entityTransaction = null;
		try{
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager(); 
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(student);
			
			 System.out.println("Record Saved");
			 entityTransaction.commit();
			 entityManager.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		  entityManager.close();
	}

}
