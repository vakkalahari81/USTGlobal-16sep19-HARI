package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;
import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class GetResultList {
	
	public static void main(String[] args) {
		
		EntityManagerFactory	entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
	    String jpql = "from ProductInfo";
	               
	    Query query = entityManager.createQuery(jpql);
	    
	    
	    List<ProductInfo> itr = query.getResultList();
	     for(ProductInfo o :itr) {
		   System.out.println("--------------------------------");
		   System.out.println(o.getPid());
		   System.out.println(o.getPname());
		   System.out.println(o.getQuantity());
	   }
	    	
	}	
 }
