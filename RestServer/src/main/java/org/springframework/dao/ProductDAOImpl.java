package org.springframework.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.model.Product;

public class ProductDAOImpl implements ProductDAO{

	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPerson(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Product saved successfully, Product Details="+p);
		
	}

	@Override
	public void updatePerson(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Product updated successfully, Product Details="+p);
		
	}

	@Override
	public List<Product> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productList = session.createQuery("from Product").list();
		for(Product p : productList){
			logger.info("Product List::"+p);
		}
		return productList;
	}

	@Override
	public Product getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Product p = (Product) session.load(Product.class, new Integer(id));
		logger.info("Product loaded successfully, Product details="+p);
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Product deleted successfully, product details="+p);
		
	}

}
