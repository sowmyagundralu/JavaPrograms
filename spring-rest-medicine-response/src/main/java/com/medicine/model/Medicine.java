package com.medicine.model;

public class Medicine {

	private String name;
	private int medicineId;
	private String quantity;
	private String category;
	private String brand;
	private double price;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medicine(String name, int medicineId, String quantity, String category, String brand, double price) {
		super();
		this.name = name;
		this.medicineId = medicineId;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.price = price;
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

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	@Override
	public String toString() {
		return "Medicine [name=" + name + ", medicineId=" + medicineId + ", quantity=" + quantity + ", category="
				+ category + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
