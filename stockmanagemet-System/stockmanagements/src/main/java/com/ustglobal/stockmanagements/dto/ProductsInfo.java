package com.ustglobal.stockmanagements.dto;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "products_info")
public class ProductsInfo {

	@Id
	@Column
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private String category;

	@Column
	private String company;

	@Column
	private int quantity;

	@Column
	private double price;

	@Exclude
	@ManyToMany(mappedBy = "productsInfo")
	private List<OrderInfo> order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
