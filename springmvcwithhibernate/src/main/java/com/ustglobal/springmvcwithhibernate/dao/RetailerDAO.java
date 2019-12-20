package com.ustglobal.springmvcwithhibernate.dao;

import com.ustglobal.springmvcwithhibernate.dto.ProductBean;
import com.ustglobal.springmvcwithhibernate.dto.RetailerBean;

public interface RetailerDAO {
	
	public int registration(RetailerBean bean);
	public RetailerBean login(int id, String password);
	public ProductBean searchProduct(int id);
	public boolean updatePassword(int id, String password);
	

}
