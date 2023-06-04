package com.medicine.controllers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.model.Medicine;
import com.medicine.service.IMedicineService;

@RestController
@RequestMapping("/medicine-api")

public class MedicineController {

	
	private IMedicineService medicineService;
	
	
	public MedicineController(IMedicineService medicineService) {
		super();
		this.medicineService = medicineService;
	}


	@PostMapping("/medicines")
	ResponseEntity<Void> addMedicine(@RequestBody Medicine medicine)
	{ 
		medicineService.addMedicine(medicine);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding medicine");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		
	}
	@PutMapping("/medicines")
	ResponseEntity<Void> updateAllMedicines(@RequestBody Medicine medicine) {
		medicineService.updateMedicine(medicine.getMedicineId(),medicine.getPrice());
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","updating book");
		return ResponseEntity .accepted().build();
	}
	@PatchMapping("/medicines/id/{medicineId}/price/{price}")  //write particular properties
	ResponseEntity<Void> updateMedicine(@PathVariable("medicineId")int medicineId,@PathVariable("price")double price) {
		medicineService.updateMedicine(medicineId,price);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","updating medicine");
		return ResponseEntity .accepted().build();
	}
	
	@DeleteMapping("/medicines/id/{medicineId}")
	ResponseEntity<Void> deleteMedicine(@PathVariable("medicineId") int medicineId)
	{
		medicineService.deleteMedicine(medicineId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","deleting medicine");
		return ResponseEntity .accepted().build();
	}
	@GetMapping("/medicines")
	ResponseEntity<List<Medicine>> getAll(){
		List<Medicine> medicines = medicineService.getAll();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","Returning all medicines");
		httpHeaders.add("desc","medicines from database");
		
		ResponseEntity<List<Medicine>> responseEntity=new ResponseEntity<List<Medicine>>(medicines,httpHeaders,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/medicines/id/{medicineId}")
	ResponseEntity<Medicine> getById(@PathVariable("medicineId") int medicineId)
	{
		Medicine medicine=medicineService.getById(medicineId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","returning a medicine by id");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(medicine);
	}
	@GetMapping("/medicines/category/{category}")
	ResponseEntity<List<Medicine>> getByCategory(@PathVariable("category") String category)
	{
		List<Medicine> medicine=medicineService.getByCategory(category);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","returning a medicine by category");
		return ResponseEntity.ok(medicine);
	}
	@GetMapping("/medicines/price/{price}")
	ResponseEntity<List<Medicine>> getByPriceLessThan(@PathVariable("price") double price)
	{
		List<Medicine> medicine=medicineService.getByPriceLessThan(price);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","returning a medicine by price");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(medicine);
	}
	@GetMapping("/medicines/name/category")
	ResponseEntity<List<Medicine>> getByNameContaining(@RequestParam("name") String name,@RequestParam("category") String category)
	{
		List<Medicine> medicine=medicineService.getByNameContaining(name, category);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","Returning medicine by name contains");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(medicine);
	}
	ResponseEntity<List<Medicine>> getByBrandStaring(@RequestParam("brand") String brand)
	{
		List<Medicine> medicine=medicineService.getByBrandStarting(brand);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","Returning medicine by brand starts with");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(medicine);
	
	}
	
	
}
