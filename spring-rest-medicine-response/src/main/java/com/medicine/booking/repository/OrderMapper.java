package com.medicine.booking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medicine.booking.model.Order;


public class OrderMapper implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order=new Order();
		order.setName(rs.getString("name"));
		order.setQuantity(rs.getString("quantity"));
		order.setCategory(rs.getString("category"));
		order.setBrand(rs.getString("brand"));
		order.setPrice(rs.getDouble("price"));
		order.setOrderId(rs.getInt("orderId"));
		return order;
	}

	
}
