package com.medicine.service;

import java.util.List;

import com.medicine.exceptions.MedicineNotFoundException;
import com.medicine.model.Medicine;

public interface IMedicineService {

	void addMedicine(Medicine medicine);
	void updateMedicine(int id,double price);
	void deleteMedicine(int id);
	
	List<Medicine> getAll();
	Medicine getById(int medicineId) throws MedicineNotFoundException;
	List<Medicine> getByCategory(String category) throws MedicineNotFoundException;
	List<Medicine> getByPriceLessThan(double price) throws MedicineNotFoundException;
	List<Medicine> getByNameContaining(String name,String category) throws MedicineNotFoundException;
	List<Medicine> getByBrandStarting(String brand)  throws MedicineNotFoundException;
	
}
