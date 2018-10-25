package org.springframework.rest;

import java.net.URL;
import java.sql.Date;

import org.codehaus.jackson.annotate.JsonAutoDetect;


//@XmlRootElement
@JsonAutoDetect
public final class Product {

	private int productId;
	private String productName;
	public Product(int productId, String productName, String productCode, Date releaseDate, String description,
			int price, int starRating, URL imageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.description = description;
		this.price = price;
		this.starRating = starRating;
		this.imageUrl = imageUrl;
	}

	private String productCode;
	private Date releaseDate;
	private String description;
	private int price;
	private int starRating;
	private URL imageUrl;



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public URL getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(URL imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
