package com.medicine.booking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.booking.model.Order;
import com.medicine.booking.model.OrderConverter;
import com.medicine.booking.model.OrderDTO;
import com.medicine.booking.repository.IOrderRepository;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private IOrderRepository orderRepository;
	@Autowired
	private OrderConverter orderConverter;
	@Override
	public void addOrder(Order order) {
		
		orderRepository.addOrder(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		
		orderRepository.deleteOrder(orderId);
	}

	@Override
	public List<OrderDTO> getAll(String userId) {
		
		List<Order> orders= orderRepository.findAll(userId);
		return orders.stream().map((order)->orderConverter.toDto(order)).collect(Collectors.toList());
	}
	

}
