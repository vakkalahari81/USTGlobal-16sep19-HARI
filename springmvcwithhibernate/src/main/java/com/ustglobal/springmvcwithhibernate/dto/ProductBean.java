package com.ustglobal.springmvcwithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductBean {
	
	@Id
	@Column
	@GeneratedValue
	int oid;
	
	@Column
	String pname;
	
	@Column
	int price;
	
	@Column
	int qunatity;
	
	@Column
	int amountpayble;
	
	
	public int getAmountpayble() {
		return amountpayble;
	}
	public void setAmountpayble(int amountpayble) {
		this.amountpayble = amountpayble;
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
}
