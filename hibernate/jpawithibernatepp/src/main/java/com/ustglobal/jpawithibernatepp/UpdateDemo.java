package com.ustglobal.jpawithibernatepp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class UpdateDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory  entityManagerFactory = null; 
		EntityManager entityManager = null;
		EntityTransaction entityTransction = null; 
		try {
				entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				entityManager = entityManagerFactory.createEntityManager();
				entityTransction = entityManager.getTransaction();
				entityTransction.begin();
				ProductInfo productInfo = entityManager.find(ProductInfo.class, 10);
				productInfo.setPname("pencil");
				
				System.out.println("Update Record");
				entityTransction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransction.rollback();
		}
		entityManager.close();
	}
}
