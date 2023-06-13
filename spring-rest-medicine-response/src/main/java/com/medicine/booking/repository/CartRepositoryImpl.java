package com.medicine.booking.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.medicine.booking.model.Cart;

@Repository
public class CartRepositoryImpl  implements ICartRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addToCart(Cart cart) {
   
		String sql="insert into cart(medicineId,cartId,userId)values(?,cart_seq.nextval,?)";
		jdbcTemplate.update(sql,cart.getMedicineId(),cart.getUserId());

		
	}

	@Override
	public List<Cart> findAll(String userId) {

		String sql="select name,brand,category,price,quantity,cartId from medicine ,cart  where medicine.medicineId=cart.medicineId and cart.userId=?";

		return jdbcTemplate.query(sql, new CartMapper(),userId);
	}

	@Override
	public void deleteCart(int cartId) {
		
		String sql="delete from cart where cartId=?";
		 jdbcTemplate.update(sql,cartId);
		
	}
	

}
