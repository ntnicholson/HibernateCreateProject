package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class ProductService 
{
	public boolean createProduct(Product create) 
	{
		boolean created = false; 
		
		Configuration config = new Configuration().configure();
		config.addAnnotatedClass(com.entity.Product.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
	
		SessionFactory f = config.buildSessionFactory(builder.build());
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(create);
		tx.commit();
		s.close();
		created = true;
		
		return created;
	}
}
