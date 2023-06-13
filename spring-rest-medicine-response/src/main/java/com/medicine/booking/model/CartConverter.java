package com.medicine.booking.model;

import org.springframework.stereotype.Component;

@Component
public class CartConverter {

	public CartDTO toDto(Cart cart)
	{
		CartDTO cartDto = new CartDTO();
		cartDto.setName(cart.getName());
		cartDto.setQuantity(cart.getQuantity());
		cartDto.setCategory(cart.getCategory());
		cartDto.setBrand(cart.getBrand());
		cartDto.setPrice(cart.getPrice());
		cartDto.setCartId(cart.getCartId());
		
		return cartDto;
	}
}
