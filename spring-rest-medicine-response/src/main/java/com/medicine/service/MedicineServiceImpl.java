package com.medicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.exceptions.MedicineNotFoundException;
import com.medicine.model.Medicine;
import com.medicine.repository.IMedicineRepository;

@Service
public class MedicineServiceImpl implements IMedicineService {

	@Autowired
	IMedicineRepository medicineRepository;
	@Override
	public void addMedicine(Medicine medicine) {
		medicineRepository.addMedicine(medicine);
		
	}

	@Override
	public void updateMedicine(int id, double price) {
		medicineRepository.updateMedicine(id, price);
		
	}

	@Override
	public void deleteMedicine(int id) {
		medicineRepository.deleteMedicine(id);
		
	}

	@Override
	public List<Medicine> getAll() {
		
		return medicineRepository.findAll();
	}

	@Override
	public Medicine getById(int medicineId) throws MedicineNotFoundException {
		
		Medicine medicine = medicineRepository.findById(medicineId)
				.orElseThrow(()->new MedicineNotFoundException("no medicine with that id"));
		return medicine;
	}

	@Override
	public List<Medicine> getByCategory(String category) throws MedicineNotFoundException {
		
		List<Medicine> medicinesByCategory = medicineRepository.findByCategory(category);
		if(medicinesByCategory.isEmpty())
			throw new MedicineNotFoundException("no medicine with that category");
				
		return medicinesByCategory ;
	}

	@Override
	public List<Medicine> getByPriceLessThan(double price) throws MedicineNotFoundException {
		List<Medicine> medicinesByPrice = medicineRepository.findByPriceLessThan(price);
		if(medicinesByPrice.isEmpty())
			throw new MedicineNotFoundException("no medicine with that price");
		return medicinesByPrice;
	}

	@Override
	public List<Medicine> getByNameContaining(String name, String category) throws MedicineNotFoundException {
		List<Medicine> medicinesByName = medicineRepository.findByNameContaining(name, category);
		if(medicinesByName.isEmpty())
			throw new MedicineNotFoundException("no medicine with that name");
		return medicinesByName;
	}

	@Override
	public List<Medicine> getByBrandStarting(String brand) throws MedicineNotFoundException {
		
		List<Medicine> medicinesByBrand = medicineRepository.findByBrandStarting(brand);
		if(medicinesByBrand.isEmpty())
			throw new MedicineNotFoundException("no medicine with that brand");
		return medicinesByBrand;
	}

	
}
