package com.medicine.booking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.booking.model.Cart;
import com.medicine.booking.model.CartDTO;
import com.medicine.booking.service.ICartService;

@RestController
@RequestMapping("/cart-api")
public class CartController {

	@Autowired
	ICartService cartService;
	@PostMapping("/cartitems")
	ResponseEntity<Void> addToCart(@RequestBody Cart cart)
	{ 
		cartService.addToCart(cart);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding medicine to cart");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		
	}
	@GetMapping("/cartitems/userId/{userId}")
	ResponseEntity<List<CartDTO>> getAll(@PathVariable("userId")String userId){
		List<CartDTO> medicines =cartService.getAll(userId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info","Returning all cart items");
		httpHeaders.add("desc","cartitems from database");
		
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(medicines);
	}
	@DeleteMapping("/cartitems/cartId/{cartId}")
	ResponseEntity<Void> deleteCart(@PathVariable("cartId")int cartId)
	{ 
		cartService.deleteCart(cartId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "deleting medicine from cart");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		
	}
	
}
