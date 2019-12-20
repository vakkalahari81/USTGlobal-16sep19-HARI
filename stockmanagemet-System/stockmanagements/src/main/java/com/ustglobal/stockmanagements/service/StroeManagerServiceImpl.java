package com.ustglobal.stockmanagements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagements.dao.StoreManager;
import com.ustglobal.stockmanagements.dto.ProductsInfo;

@Service
public class StroeManagerServiceImpl implements StoreManagerService {

	@Autowired
	private StoreManager dao;

	@Override
	public boolean addProduct(ProductsInfo product) {

		return dao.addProduct(product);
	}

	@Override
	public List<ProductsInfo> searchByName(String name) {
		return dao.searchByName(name);
	}

	@Override
	public boolean modifyProduct(ProductsInfo product) {

		return dao.modifyProduct(product);
	}

	@Override
	public List<ProductsInfo> searchByCompany(String company) {

		return dao.searchByCompany(company);
	}

	@Override
	public List<ProductsInfo> searchByCategory(String category) {
		return dao.searchByCategory(category);
	}
}
