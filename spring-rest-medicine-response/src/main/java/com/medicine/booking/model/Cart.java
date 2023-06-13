package com.medicine.booking.model;

public class Cart {

	private String name;
	private int medicineId;
	private String quantity;
	private String category;
	private String brand;
	private double price;
	private int cartId;
	private String userId;
	public Cart() {
		super();
		
	}
	
	public Cart(String name, int medicineId, String quantity, String category, String brand, double price, int cartId,
			String userId) {
		super();
		this.name = name;
		this.medicineId = medicineId;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.cartId = cartId;
		this.userId = userId;
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
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Cart [name=" + name + ", medicineId=" + medicineId + ", quantity=" + quantity + ", category=" + category
				+ ", brand=" + brand + ", price=" + price + ", cartId=" + cartId + ", userId=" + userId + "]";
	}

	
	
	
	
}
