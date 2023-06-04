package com.medicine.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medicine.model.Medicine;

public class MedicineMapper implements RowMapper<Medicine>{

	@Override
	public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
		Medicine medicine = new Medicine();
		medicine.setName(rs.getString("name"));
		medicine.setMedicineId(rs.getInt("medicineId"));
		medicine.setQuantity(rs.getString("quantity"));
		medicine.setCategory(rs.getString("category"));
		medicine.setBrand(rs.getString("brand"));
		medicine.setPrice(rs.getDouble("price"));
		return medicine;
	}

	
}
