package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectNames {
	
	public static void main(String[] args) {
		
		EntityManagerFactory	entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "select pname from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		
		List<String>it = query.getResultList();
		for(String o : it) {
			           System.out.println("-------------------");
			           System.out.println(o);
		}
		
	}
}
