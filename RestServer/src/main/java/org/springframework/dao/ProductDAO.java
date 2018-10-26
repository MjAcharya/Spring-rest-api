package org.springframework.dao;

import java.util.List;

import org.springframework.model.Product;

public interface ProductDAO {
	
	public void addPerson(Product p);
	public void updatePerson(Product p);
	public List<Product> listPersons();
	public Product getPersonById(int id);
	public void removePerson(int id);

}
