package com.ustglobal.stockmanagements.dto;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderInfo {
	
	@Id
	@Column
	@GeneratedValue
	private int oid;
	
	@Column
	private double totalprice;
	
	@Column
	private double totalpricewithgst;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order_history_info",joinColumns = @JoinColumn(name="oid"),inverseJoinColumns= @JoinColumn(name="id"))
	private List<ProductsInfo> productsInfo;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public double getTotalpricewithgst() {
		return totalpricewithgst;
	}

	public void setTotalpricewithgst(double totalpricewithgst) {
		this.totalpricewithgst = totalpricewithgst;
	}
}
