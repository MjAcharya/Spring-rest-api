/**
 * 
 */
package org.springframework.service;

import java.util.List;

import org.springframework.model.Product;

/**
 * @author Admin
 *
 */
public interface ProductService {

	public void addPerson(Product p);
	public void updatePerson(Product p);
	public List<Product> listPersons();
	public Product getPersonById(int id);
	public void removePerson(int id);
}
