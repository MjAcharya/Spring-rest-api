package org.springframework.service;

import java.util.List;

import org.springframework.dao.ProductDAO;
import org.springframework.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		
		this.productDAO = productDAO;
	}

	@Override
	public void addPerson(Product p) {
		
		this.productDAO.addPerson(p);
	}

	@Override
	public void updatePerson(Product p) {
		
		this.productDAO.updatePerson(p);
	}

	@Override
	public List<Product> listPersons() {

		return this.productDAO.listPersons();
	}

	@Override
	public Product getPersonById(int id) {

		return this.productDAO.getPersonById(id);
	}

	@Override
	public void removePerson(int id) {
		
		this.productDAO.removePerson(id);

	}

}
