package com.medicine.booking.model;

public class OrderDTO {

	private String name;
	private String quantity;
	private String category;
	private String brand;
	private double price;
	private int orderId;
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(String name, String quantity, String category, String brand, double price, int orderId) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderDTO [name=" + name + ", quantity=" + quantity + ", category=" + category + ", brand=" + brand
				+ ", price=" + price + ", orderId=" + orderId + "]";
	}
	
}
