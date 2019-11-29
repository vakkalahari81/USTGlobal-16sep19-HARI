package com.ustglobal.jpawithibernatepp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatepp.onetone.Person;
import com.ustglobal.jpawithibernatepp.onetone.VoterCard;

public class TestOnetoOne {

	public static void main(String[] args) {
	
	     VoterCard vc = new VoterCard();
		 vc.setVid(10);
		 vc.setVname("hari");
		
		 Person p = new Person();
		 p.setPid(10);
		 p.setPname("shashi");
		 p.setVoterCard(vc);
		 
		 EntityManager entityManager = null;
		 EntityTransaction entityTransaction = null;
		try{
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			
			entityManager = entityManagerFactory.createEntityManager(); 
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			//entityManager.persist(p);
			 VoterCard v = entityManager.find(VoterCard.class, 10);
			 System.out.println(v.getPerson().getPid());
			 System.out.println(v.getPerson().getPname());
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
