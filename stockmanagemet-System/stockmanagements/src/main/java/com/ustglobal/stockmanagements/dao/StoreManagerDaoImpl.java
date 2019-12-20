package com.ustglobal.stockmanagements.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.ustglobal.stockmanagements.dto.ProductsInfo;

@Repository
public class StoreManagerDaoImpl implements StoreManager {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction taranscation = manager.getTransaction();
		try {
			taranscation.begin();
			manager.persist(product);
			taranscation.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ProductsInfo> searchByName(String name) {
		EntityManager manager = factory.createEntityManager();

		String jpql = "from ProductsInfo where name=:name";
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql, ProductsInfo.class);
		query.setParameter("name", name);
		try {
			List<ProductsInfo> info = query.getResultList();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean modifyProduct(ProductsInfo product) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo products = manager.find(ProductsInfo.class, product.getId());
			products.setName(product.getName());
			products.setCategory(product.getCategory());
			products.setCompany(product.getCompany());
			products.setQuantity(product.getQuantity());
			products.setPrice(product.getPrice());
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<ProductsInfo> searchByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo where company=:company";
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql, ProductsInfo.class);
		query.setParameter("company", company);
		try {
			List<ProductsInfo> info = query.getResultList();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductsInfo> searchByCategory(String category) {

		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductsInfo where category=:category";
		TypedQuery<ProductsInfo> query = manager.createQuery(jpql, ProductsInfo.class);
		query.setParameter("category", category);
		try {
			List<ProductsInfo> info = query.getResultList();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
