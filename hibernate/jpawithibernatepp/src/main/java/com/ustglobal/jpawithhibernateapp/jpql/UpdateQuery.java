package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateQuery {
	
	public static void main(String[] args) {
		
		EntityManager  entityManager  = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		     entityManager = entityManagerFactory.createEntityManager();
		     transaction = entityManager.getTransaction();
		     transaction.begin();
		     String jpql = "update ProductInfo set pname = 'watch' where pid = 11";
		     Query query =  entityManager.createQuery(jpql);
		     int count = query.executeUpdate();
		     System.out.println(count+"record updated");
		     transaction.commit();
		
	  }
	catch(Exception e) {
		e.printStackTrace();
		transaction.rollback();
		
	}
		finally {
		entityManager.close();
    }
  }
}
