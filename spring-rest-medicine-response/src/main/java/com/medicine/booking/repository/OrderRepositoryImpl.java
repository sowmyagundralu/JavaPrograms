
package com.medicine.booking.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medicine.booking.model.Order;

@Repository
public class OrderRepositoryImpl implements IOrderRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addOrder(Order order) {
	
		String sql="insert into orders(medicineId,userId,orderId)values(?,?,order_seq.nextval)";
		jdbcTemplate.update(sql,order.getMedicineId(),order.getUserId());
		
	}

	@Override
	public void deleteOrder(int orderId) {
		
		String sql="delete from orders where orderId=? ";
		jdbcTemplate.update(sql,orderId);
		
	}

	@Override
	public List<Order> findAll(String userId) {
		String sql="select name,quantity,category,brand,price,orderId from medicine ,orders  where medicine.medicineId=orders.medicineId and orders.userId=?";
		return jdbcTemplate.query(sql,new OrderMapper(),userId);
	}

	
}
