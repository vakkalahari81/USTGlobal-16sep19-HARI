package com.ustglobal.jpawithibernatepp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernatepp.manytoone.Pencil;
import com.ustglobal.jpawithibernatepp.manytoone.PencilBox;

public class TestManyToOne {
	
	public static void main(String[] args) {
		
		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("Apsara");
		
		Pencil pl = new Pencil();
		pl.setPid(10);
		pl.setColor("black");
		pl.setPencilBox(pbox);
		
		Pencil pq = new Pencil();
		pq.setPid(11);
		pq.setColor("red");
		pq.setPencilBox(pbox);
		
		
		
		
		 EntityManager entityManager = null;
		 EntityTransaction entityTransaction = null;
		 try{
			EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			
			entityManager = entityManagerFactory.createEntityManager(); 
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(pl);
			entityManager.persist(pq);
			entityManager.persist("saved");
			
			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		 finally {
		entityManager.close();
		}
	}
}
