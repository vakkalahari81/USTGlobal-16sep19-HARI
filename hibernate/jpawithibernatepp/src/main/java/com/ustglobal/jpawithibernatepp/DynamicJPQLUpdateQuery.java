package com.ustglobal.jpawithibernatepp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicJPQLUpdateQuery {
	
	public static void main(String[] args) {
		
		EntityManager  entityManager  = null;
		EntityTransaction transaction = null;
		
		try {
			 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		     entityManager = entityManagerFactory.createEntityManager();
		     transaction = entityManager.getTransaction();
		     transaction.begin();
		     String jpql = "update ProductInfo set pname =: name where pid =: id";
		     Query query =  entityManager.createQuery(jpql);
		     
		     query.setParameter("name", "book");
		     query.setParameter("id", 12);
		     
		     query.setParameter("name", "java");
		     query.setParameter("id", 13);
		     
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
