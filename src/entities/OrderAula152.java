package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderAula152 {

	private Date moment;
	private OrderStatus status;
	
	private ClientAula152 client;
	private List<OrderItemAula152> orderItem = new ArrayList<OrderItemAula152>();

	public class Order {

	}	

	public OrderAula152(Date moment, OrderStatus status, ClientAula152 client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ClientAula152 getClient() {
		return client;
	}

	public void setClient(ClientAula152 client) {
		this.client = client;
	}

	public List<OrderItemAula152> getOrderItem() {
		return orderItem;
	}
	
	public void addItem (OrderItemAula152 item) {
		
		orderItem.add(item);		
	}
	
	public void removeItem (OrderItemAula152 item) {
		
		orderItem.remove(item);		
	}
	
	public double orderTotPrice() {
		
		Double totalPrice = 0.0;
		
		for (OrderItemAula152 ord : orderItem) {			
		
			totalPrice += ord.totalPrice();
		}
		return totalPrice;		
	}
}
