package com.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

	private Integer id;
	private Integer quantity;
	private Double price;
	private FoodItemDto foodItem;
}
