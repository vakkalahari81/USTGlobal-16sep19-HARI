package com.ustglobal.springmvcwithhibernate.service;

import com.ustglobal.springmvcwithhibernate.dto.ProductBean;
import com.ustglobal.springmvcwithhibernate.dto.RetailerBean;


public interface RetailerService {
	
	public int registration(RetailerBean bean);
	public RetailerBean login(int id, String password);
	public ProductBean searchProduct(int id);
	public boolean updatePassword(int id, String password);

}
