package com.medicine.booking.model;

public class Order {

	private String name;
	private int medicineId;
	private String quantity;
	private String category;
	private String brand;
	private double price;
	private int orderId;
	private String userId;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String name, int medicineId, String quantity, String category, String brand, double price, 
			int orderId,String userId) {
		super();
		this.name = name;
		this.medicineId = medicineId;
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
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", medicineId=" + medicineId + ", quantity=" + quantity + ", category="
				+ category + ", brand=" + brand + ", price=" + price + ", orderId=" + orderId + ", userId=" + userId
				+ "]";
	}
	
	
	
}
