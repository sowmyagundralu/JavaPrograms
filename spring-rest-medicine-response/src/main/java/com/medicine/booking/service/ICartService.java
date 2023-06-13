package com.medicine.booking.service;

import java.util.List;

import com.medicine.booking.model.Cart;
import com.medicine.booking.model.CartDTO;

public interface ICartService {

	void addToCart(Cart cart);
	List<CartDTO> getAll(String userId);
	void deleteCart(int cartId);
}
