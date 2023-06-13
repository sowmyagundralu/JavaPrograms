package com.medicine.booking.repository;

import java.util.List;

import com.medicine.booking.model.Order;

public interface IOrderRepository {

	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> findAll(String userId);
}
