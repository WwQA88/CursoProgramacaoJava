package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ClientAula152;
import entities.OrderAula152;
import entities.OrderItemAula152;
import entities.ProductAula152;
import entities.enums.OrderStatus;

public class Aulas152_EX_Fixacao {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine(); 
		System.out.print("Email: ");
		String email = sc.nextLine();	
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		System.out.println();
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();		
		System.out.print("How many items to this order: ");
		Integer nItem = sc.nextInt();
		Date moment = new Date();
		
		OrderAula152 order = new OrderAula152(moment, OrderStatus.valueOf(status)
				, new ClientAula152(name, email, birthDate));		
		
		for(int i=1; i <= nItem; i++) {
			
			System.out.println("Enter #" + i + " item data: ");
			
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityItem = sc.nextInt();
			Double priceItem = productPrice;
			
			OrderItemAula152 ord  = new OrderItemAula152(quantityItem,  priceItem
					, new ProductAula152(productName, productPrice));
			order.addItem(ord);
		}		
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + order.getMoment().toInstant().atZone(ZoneId.systemDefault()).format(fmt2));
		System.out.println("Order status: " + order.getStatus()
		.toString().substring(0,1)
		.toUpperCase()
		.concat(status.substring(1)
		.toLowerCase()));
		System.out.println("Client: "
				+ order.getClient().getName()
				+ " (" + (order.getClient().getBirthDate().toInstant().atZone(ZoneId.systemDefault()).format(fmt1))
				+ ")"
				+ " - "
				+ order.getClient().getEmail());				
		
		System.out.println("Order items:");		
		
		System.out.println(order.getOrderItem().get(0).descProd() + ", "
				+ "$" + String.format("%.2f", order.getOrderItem().get(0).getPriceItem()) 
				+ ", " + order.getOrderItem().get(0).descQuantity()
				+ ", " + String.format("Subtotal: " + "%.2f", order.getOrderItem().get(0).descSubtotal()));
		
		System.out.println(order.getOrderItem().get(1).descProd() + ", "
				+ "$" + String.format("%.2f", order.getOrderItem().get(1).getPriceItem())
				+ ", " + order.getOrderItem().get(1).descQuantity()
				+ ", " + String.format("Subtotal: " + "%.2f", order.getOrderItem().get(1).descSubtotal()));	
		
		System.out.println();
	
		System.out.println("Total price: " + "$" + String.format("%.2f"
				, order.orderTotPrice()));
		sc.close();	

	}
}
