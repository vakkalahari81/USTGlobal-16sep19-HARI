package com.ustglobal.stockmanagements.service;

import java.util.List;

import com.ustglobal.stockmanagements.dto.ProductsInfo;

public interface StoreManagerService {

	public boolean addProduct(ProductsInfo product);

	public List<ProductsInfo> searchByName(String name);

	public List<ProductsInfo> searchByCompany(String company);

	public List<ProductsInfo> searchByCategory(String category);

	public boolean modifyProduct(ProductsInfo product);
}
