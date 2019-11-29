package com.ustglobal.jpawithibernatepp.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "pencilBox")
public class PencilBox {
	
	@Id
	@Column
	private int bid;
	@Column
	String bname;
}