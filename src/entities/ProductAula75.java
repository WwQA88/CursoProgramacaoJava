package entities;

public class ProductAula75 {
	
	public String name;
	public double price;
	public int quantity;
	
	// Construtor
	// Serve para obrigar o programador a não criar dados/variaveis inconsistentes
	
	public ProductAula75(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}
	
	public String toString() {
		
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: "
		+ "$ "
		+ String.format("%.2f", totalValueInStock());
	}

}
