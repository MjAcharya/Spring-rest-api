package org.springframework.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	private static final Map<Integer, Product> characters = new HashMap<Integer, Product>();
	
	static {
		try {
			characters.put(1, new Product(2,"Garden  Cart","GDN-909",new Date(0),"Cool!!",1200,4,new URL("https://openclipart.org/image/2400px/svg_to_png/280962/ladyinreddances.png")));
			characters.put(2, new Product(3,"Demon Gate","GDN-909",new Date(0),"Cool!!",1250,3,new URL("https://openclipart.org/image/90px/svg_to_png/290901/pixeldemon.png")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/rest/{productId}", method = RequestMethod.GET)
	@ResponseBody
	public Product findCharacter(@PathVariable int productId) {
		return characters.get(productId);
		
		
	}
	
	@RequestMapping(value = "/rest/", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> findCharacterAll() {
		List<Product> cartList = new ArrayList<Product>(characters.values());
		return cartList;
		
		
	}
	
}
