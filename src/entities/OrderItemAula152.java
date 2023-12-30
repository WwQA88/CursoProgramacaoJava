package entities;

public class OrderItemAula152 {

	private Integer quantityItem;
	private Double priceItem;
	private ProductAula152 product;

	public OrderItemAula152() {

	}

	public OrderItemAula152(Integer quantityItem, Double priceItem, ProductAula152 product) {

		this.quantityItem = quantityItem;
		this.priceItem = priceItem;
		this.product = product;
	}

	public Integer getQuantityItem() {
		return quantityItem;
	}

	public void setQuantityItem(Integer quantityItem) {
		this.quantityItem = quantityItem;
	}

	public Double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(Double priceItem) {
		this.priceItem = priceItem;
	}

	public ProductAula152 getProduct() {
		return product;
	}

	public void setProduct(ProductAula152 product) {
		this.product = product;
	}

	public Double totalPrice() {

		return quantityItem * product.getProductPrice();

	}	
	public String descProd() {
		
		return product.getProductName();
	}
	
	public String descQuantity() {
		
		return "Quantity: " + quantityItem;
	}
	
	public double descSubtotal() {
		
		double sumPriceItem = priceItem * quantityItem;
		
		return sumPriceItem;  
	}
}
