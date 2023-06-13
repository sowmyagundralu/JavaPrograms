package com.medicine.booking.repository;

import java.util.List;

import com.medicine.booking.model.Cart;

public interface ICartRepository {

	void addToCart(Cart cart);
	List<Cart> findAll(String userId);
	void deleteCart(int cartId);
}
