package com.company.demo.hibernatedemoevening;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class ProductDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//save prodcut data to the database
	
	public void saveProduct(Product prodcut){
//		/template.save(prodcut);
	}
}
