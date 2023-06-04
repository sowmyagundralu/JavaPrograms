package com.medicine.repository;

import java.util.List;
import java.util.Optional;

import com.medicine.model.Medicine;

public interface IMedicineRepository {

	void addMedicine(Medicine medicine);
	void updateMedicine(int id,double price);
	void deleteMedicine(int id);
	
	List<Medicine> findAll();
	Optional<Medicine> findById(int medicineId) ;
	List<Medicine> findByCategory(String category) ;
	List<Medicine> findByPriceLessThan(double price) ;
	List<Medicine> findByNameContaining(String name,String category) ;
	List<Medicine> findByBrandStarting(String brand);
	
}
