package com.medicine.booking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medicine.booking.model.Cart;
import com.medicine.model.Medicine;

public class CartMapper implements RowMapper<Cart> {

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Cart cart = new Cart();
		cart.setName(rs.getString("name"));
		cart.setQuantity(rs.getString("quantity"));
		cart.setCategory(rs.getString("category"));
		cart.setBrand(rs.getString("brand"));
		cart.setPrice(rs.getDouble("price"));
		cart.setCartId(rs.getInt("cartId"));
		return cart;
	}

	

}
