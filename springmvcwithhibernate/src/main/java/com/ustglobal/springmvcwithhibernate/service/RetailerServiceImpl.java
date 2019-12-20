package com.ustglobal.springmvcwithhibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcwithhibernate.dao.RetailerDAO;
import com.ustglobal.springmvcwithhibernate.dto.ProductBean;
import com.ustglobal.springmvcwithhibernate.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	
	@Autowired
	private RetailerDAO dao ;

	@Override
	public RetailerBean login(int id, String password) {
		return 	dao.login(id,password);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		
		return dao.updatePassword(id,password);
	}

	@Override
	public int registration(RetailerBean bean) {
		return dao.registration(bean);
	}
}
