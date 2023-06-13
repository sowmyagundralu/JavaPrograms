package com.medicine.booking.service;

import java.util.List;

import com.medicine.booking.model.Order;
import com.medicine.booking.model.OrderDTO;

public interface IOrderService {

	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<OrderDTO> getAll(String userID);
}
