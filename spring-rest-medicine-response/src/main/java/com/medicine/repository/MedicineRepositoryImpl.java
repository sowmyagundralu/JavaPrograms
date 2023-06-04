package com.medicine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.medicine.exceptions.MedicineNotFoundException;
import com.medicine.model.Medicine;

public class MedicineRepositoryImpl implements IMedicineRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addMedicine(Medicine medicine) {
		String sql= "insert into medicine(name,medicineId,quantity,category,brand,price)values(?,MEDICINESEQ.nextval,?,?,?)";
	 Object[] medicineArray = {medicine.getName(),medicine.getQuantity(),medicine.getCategory(),medicine.getBrand(),medicine.getPrice()};
	 jdbcTemplate.update(sql,medicineArray);
		
	}

	@Override
	public void updateMedicine(int id, double price) {
		String sql="update medicine set price=? where id=?";
		jdbcTemplate.update(sql,price,id);
		
	}

	@Override
	public void deleteMedicine(int id) {
		String sql="delete from medicine where id=?";
		jdbcTemplate.update(sql,id);
		
	}

	@Override
	public List<Medicine> findAll() {
		String sql="select * from medicine";
		
		return jdbcTemplate.query(sql, new MedicineMapper());
	}

	@Override
	public Optional<Medicine> findById(int medicineId) {
		
		Medicine medicine=null;
		try
		{
			String sql="select * from medicine where medicineId=?";
			jdbcTemplate.queryForObject(sql, new MedicineMapper(),medicineId);
		}
		catch (DataAccessException e) {
			throw new MedicineNotFoundException("invalid id");	
			}
		Optional<Medicine> optmedicine=Optional.of(medicine);
		return optmedicine;
	}

	@Override
	public List<Medicine> findByCategory(String category) {
		
		String sql="select * from medicine where category =?";
		
		return jdbcTemplate.query(sql, new MedicineMapper(),category);
	}

	@Override
	public List<Medicine> findByPriceLessThan(double price) {
		String sql="select * from medicine where price< ?";
		
		return jdbcTemplate.query(sql, new MedicineMapper(),price);
	}

	@Override
	public List<Medicine> findByNameContaining(String name, String category) {
		String sql="select * from medicine where category=? and name like ?";
		
		return jdbcTemplate.query(sql, new MedicineMapper(),category,"%"+name+"%");
	}

	@Override
	public List<Medicine> findByBrandStarting(String brand) {
		String sql="select * from medicine where brand like ?";
		
		return jdbcTemplate.query(sql, new MedicineMapper(),brand+"%");
	}

	
}
