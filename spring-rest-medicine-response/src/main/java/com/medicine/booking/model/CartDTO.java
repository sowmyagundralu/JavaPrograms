package com.medicine.booking.model;

public class CartDTO {

	private String name;
	private String quantity;
	private String category;
	private String brand;
	private double price;
	private int cartId;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(String name, String quantity, String category, String brand, double price, int cartId) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.cartId = cartId;
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
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	@Override
	public String toString() {
		return "CartDTO [name=" + name + ", quantity=" + quantity + ", category=" + category + ", brand=" + brand
				+ ", price=" + price + ", cartId=" + cartId + "]";
	}
	
}
