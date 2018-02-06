package com.company.demo.hibernatedemoevening;
//java classname is equal to database tablename

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	//primary key is must and should
	@Id
private int prodcutid;
public Product(int prodcutid, String prodcutname) {
	super();
	this.prodcutid = prodcutid;
	this.prodcutname = prodcutname;
}//if you dont keep this it will take the proertyname as column name
@Column
private String prodcutname;
public int getProdcutid() {
	return prodcutid;
}
public void setProdcutid(int prodcutid) {
	this.prodcutid = prodcutid;
}
public String getProdcutname() {
	return prodcutname;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public void setProdcutname(String prodcutname) {
	this.prodcutname = prodcutname;
}
@Override
public String toString() {
	return "Product [prodcutid=" + prodcutid + ", prodcutname=" + prodcutname + "]";
}
}
