package com.ustglobal.springmvcwithhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import com.ustglobal.springmvcwithhibernate.dto.ProductBean;
import com.ustglobal.springmvcwithhibernate.dto.RetailerBean;

public class RetailerDAOImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory ;
	
	@Override
	public RetailerBean login(int id, String password) {
		

		String jpql = "from retailer where id = :id and password=:password";
		EntityManager manager  = factory.createEntityManager();
		//Query query = manager.createQuery(jpql);
		
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id",id);
		query.setParameter("password",password);
		try {
				RetailerBean bean = query.getSingleResult();
				return bean;
		 }
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int registration(RetailerBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		
		try {
				manager.persist(bean);
				transaction.commit();
				return bean.getId();
		    }
		catch(Exception e) {
			
			e.printStackTrace();
			return -1;
		}
		
}

	@Override
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePassword(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
