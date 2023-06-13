package com.medicine.booking.model;

import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

	public OrderDTO toDto(Order order)
	{
		OrderDTO orderDto=new OrderDTO();
		orderDto.setName(order.getName());
		orderDto.setQuantity(order.getQuantity());
		orderDto.setCategory(order.getCategory());
		orderDto.setBrand(order.getBrand());
		orderDto.setPrice(order.getPrice());
		orderDto.setOrderId(order.getOrderId());
		
		return orderDto;
	}
}
