package com.ustglobal.jpawithibernatepp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		
		ProductInfo productDetail =  entityManager.find(ProductInfo.class,10);
		System.out.println(ProductInfo.class);
		
		System.out.println("id = "+productDetail.getPid());
		System.out.println("Name = "+productDetail.getPname());
		System.out.println("Quantity = "+productDetail.getQuantity());	
   }
}
