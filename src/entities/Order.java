package entities;

import java.util.Date;

public class Order {
	
	private Date date;
	private ProductAula80 product;
	
	// Modificadores de acesso
	
	public Order(Date date, ProductAula80 product) {
		
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ProductAula80 getProduct() {
		return product;
	}

	public void setProduct(ProductAula80 product) {
		this.product = product;
	}
	
	
	
	

}
